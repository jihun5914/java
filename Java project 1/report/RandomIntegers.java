package escapeproject;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int sum = 0;

        // 랜덤한 정수 생성 및 배열에 저장
        System.out.print("랜덤한 정수들: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(9) + 11;  // 11 ~ 19 범위의 정수
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }

        // 평균 계산 및 출력
        double average = (double) sum / numbers.length;
        System.out.println("\n평균은 " + average);
    }
}
