package escapeproject;

import java.util.Scanner;

public class StarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("양의 정수 입력 >> ");
            int num = scanner.nextInt();
            if (num <= 0)
                break;
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();  // 다음 출력은 새 줄에서 시작
        }
        scanner.close();
    }
}
