package escapeproject;

import java.util.Scanner;

public class RefrigeratorStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("냉장고 상태 입력>> ");
        String input = scanner.nextLine();
        int status = Integer.parseInt(input, 2);  // 입력을 2진수로 처리
        
        // 비트별 상태 체크
        String powerStatus = (status & 1) == 1 ? "전원 켜져 있음" : "전원 꺼져 있음";
        String doorStatus = (status & 2) == 2 ? "문 닫혀 있음" : "문 열려 있음";
        String lightStatus = (status & 4) == 4 ? "전구 정상 작동" : "전구 손상";
        String temperatureStatus = (status & 8) == 8 ? "냉장고 온도 3도 미만" : "냉장고 온도 3도 이상";
        
        // 결과 출력
        System.out.println(powerStatus + ". " + doorStatus + ". " + lightStatus + ". " + temperatureStatus + ".");
    }
}
