package escapeproject;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.print("양의 정수 10개 입력>> ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("자릿수 합이 9인 것은: ");
        for (int i = 0; i < 10; i++) {
            if (sumOfDigits(numbers[i]) == 9) {
                System.out.print(numbers[i] + " ");
            }
        }
        scanner.close();
    }

    // 자릿수 합을 계산하는 메서드
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
