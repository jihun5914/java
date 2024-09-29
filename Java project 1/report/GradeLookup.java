package escapeproject;

import java.util.Scanner;

public class GradeLookup {
    public static void main(String[] args) {
        // 과목명 배열
        String[] subjects = {"국어", "수학", "영어", "과학", "역사"};
        // 해당 과목의 학점 배열
        int[] grades = {3, 4, 2, 5, 3};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("과목명을 입력하세요 (그만: 종료): ");
            String input = scanner.next();

            // "그만" 입력 시 프로그램 종료
            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 과목을 찾기 위한 플래그
            boolean found = false;

            // 과목명 배열에서 입력된 과목을 찾고, 해당 과목의 학점을 출력
            for (int i = 0; i < subjects.length; i++) {
                if (subjects[i].equals(input)) {
                    System.out.println(subjects[i] + "의 학점은 " + grades[i] + "입니다.");
                    found = true;
                    break;
                }
            }

            // 과목명이 배열에 없는 경우 처리
            if (!found) {
                System.out.println("해당 과목이 없습니다. 다시 입력하세요.");
            }
        }

        scanner.close();
    }
}
