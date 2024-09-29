package escapeproject;

import java.util.Scanner;

public class CarStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자동차 상태 입력>> ");
        int status = scanner.nextInt();

        // 온도는 비트 0~5로 표현되며, 0~31의 값을 가짐
        int temperature = status & 31;  // 하위 5비트(0~5) 추출
        String acStatus = (status & 64) == 64 ? "에어컨 켜짐" : "에어컨 꺼짐"; // 비트 6
        String carRunningStatus = (status & 128) == 128 ? "자동차는 달리는 상태" : "자동차는 정지 상태"; // 비트 7
        
        // 결과 출력
        System.out.println(carRunningStatus + "이고, " + acStatus + "이며, 온도는 " + temperature + "도 입니다.");
    }
}
