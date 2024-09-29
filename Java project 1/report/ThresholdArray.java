package escapeproject;

import java.util.Random;
import java.util.Scanner;

public class ThresholdArray {
    public static void main(String[] args) {
        // 4x4 크기의 2차원 배열 생성
        int[][] array = new int[4][4];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 배열에 0 ~ 255 범위의 랜덤한 값 저장
        System.out.println("초기 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(256);  // 0~255 범위의 랜덤 값 생성
                System.out.print(array[i][j] + "\t");  // 초기 배열 출력
            }
            System.out.println();  // 한 줄 출력 후 줄 바꿈
        }

        // 임계값 입력받기
        System.out.print("\n임계값을 입력하세요: ");
        int threshold = scanner.nextInt();

        // 배열의 값을 임계값에 따라 수정
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] > threshold) {
                    array[i][j] = 255;  // 임계값보다 크면 255로 설정
                } else {
                    array[i][j] = 0;  // 임계값보다 작거나 같으면 0으로 설정
                }
            }
        }

        // 수정된 배열 출력
        System.out.println("\n수정된 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");  // 수정된 배열 출력
            }
            System.out.println();  // 한 줄 출력 후 줄 바꿈
        }

        scanner.close();
    }
}
