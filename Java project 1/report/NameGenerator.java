package escapeproject;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        // 남자 이름의 중간 글자와 마지막 글자 배열
        String[] boyMiddleList = {"기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String[] boyLastList = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};

        // 여자 이름의 중간 글자와 마지막 글자 배열
        String[] girlMiddleList = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastList = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("성별을 입력하세요 (남/여) 또는 '그만'을 입력하세요: ");
            String input = scanner.next();

            // "그만" 입력 시 프로그램 종료
            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input.equals("남")) {
                // 남자 이름 생성
                String middleName = boyMiddleList[random.nextInt(boyMiddleList.length)];
                String lastName = boyLastList[random.nextInt(boyLastList.length)];
                System.out.println("생성된 남자 이름: " + middleName + lastName);
            } else if (input.equals("여")) {
                // 여자 이름 생성
                String middleName = girlMiddleList[random.nextInt(girlMiddleList.length)];
                String lastName = girlLastList[random.nextInt(girlLastList.length)];
                System.out.println("생성된 여자 이름: " + middleName + lastName);
            } else {
                System.out.println("잘못된 입력입니다. '남' 또는 '여'를 입력하세요.");
            }
        }

        scanner.close();
    }
}
