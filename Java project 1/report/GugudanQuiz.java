package escapeproject;

import java.util.Random;
import java.util.Scanner;

public class GugudanQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wrongAnswers = 0; // 틀린 답의 횟수

        while (wrongAnswers < 3) {
            // 랜덤하게 구구단 문제 출제
            int num1 = random.nextInt(9) + 1;  // 1~9 사이의 랜덤 수
            int num2 = random.nextInt(9) + 1;  // 1~9 사이의 랜덤 수
            int correctAnswer = num1 * num2;

            // 문제 출력
            System.out.printf("%d * %d = ?\n", num1, num2);

            // 사용자 입력 받기
            System.out.print("답을 입력하세요: ");
            int userAnswer = scanner.nextInt();

            // 정답 여부 확인
            if (userAnswer == correctAnswer) {
                System.out.println("정답입니다!");
            } else {
                System.out.println("틀렸습니다. 정답은 " + correctAnswer + "입니다.");
                wrongAnswers++; // 틀린 횟수 증가
            }

            // 3번 틀리면 종료
            if (wrongAnswers >= 3) {
                System.out.println("3번 틀렸습니다. 프로그램을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}
