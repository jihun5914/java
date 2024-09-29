package escapeproject;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class UniqueRandomIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        // 저장할 정수의 개수 입력받기
        System.out.print("몇 개의 정수를 저장할까요? ");
        int n = scanner.nextInt();
        
        // 중복되지 않는 랜덤 정수 저장
        while (uniqueNumbers.size() < n) {
            int randomNumber = random.nextInt(100) + 1;  // 1 ~ 100 범위의 랜덤한 정수
            uniqueNumbers.add(randomNumber);  // 중복 방지용 HashSet에 추가
        }

        // 배열에 저장하기 위해 HashSet을 배열로 변환
        int[] numbers = new int[n];
        int index = 0;
        int sum = 0;
        for (int num : uniqueNumbers) {
            numbers[index++] = num;
            sum += num;  // 합계를 계산
        }

        // 정수들 출력
        System.out.print("저장된 정수들: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 평균 계산 및 출력
        double average = (double) sum / n;
        System.out.println("\n평균은 " + average);

        scanner.close();
    }
}
