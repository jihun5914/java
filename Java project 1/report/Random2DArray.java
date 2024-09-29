package escapeproject;

import java.util.Random;

public class Random2DArray {
    public static void main(String[] args) {
        // 4x4 크기의 2차원 배열 생성
        int[][] array = new int[4][4];
        Random random = new Random();

        // 배열에 0 ~ 255 범위의 랜덤한 값 저장
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = random.nextInt(256);  // 0~255 범위의 랜덤 값 생성
            }
        }

        // 배열 출력
        System.out.println("생성된 4x4 배열:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");  // 값 출력 (탭으로 간격 조정)
            }
            System.out.println();  // 한 줄 출력 후 줄 바꿈
        }
    }
}
