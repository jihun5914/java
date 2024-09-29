package escapeproject;

import java.util.Random;
import java.util.Scanner;

public class GamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("엔터키를 눌러서 게임을 시작하세요...");
            scanner.nextLine();

            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                numbers[i] = random.nextInt(3); // 0, 1, 2 중에서 랜덤하게 선택
            }

            System.out.println("생성된 숫자: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

            if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
                System.out.println("성공.대박났어요!");
            } else {
                System.out.println("다시 시도해보세요.");
            }
        }
    }
}
