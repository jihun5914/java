package escapeproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        // 첫 번째 정수 입력 받기
        while (!validInput) {
            try {
                System.out.print("첫 번째 정수를 입력하세요: ");
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력입니다. 정수를 입력하세요.");
                scanner.next(); // 잘못된 입력을 버림
            }
        }

        validInput = false; // 두 번째 정수 입력을 위해 다시 초기화

        // 두 번째 정수 입력 받기
        while (!validInput) {
            try {
                System.out.print("두 번째 정수를 입력하세요: ");
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("유효하지 않은 입력입니다. 정수를 입력하세요.");
                scanner.next(); // 잘못된 입력을 버림
            }
        }

        // 곱 계산 및 출력
        int result = num1 * num2;
        System.out.println("두 정수의 곱: " + result);
    }
}
