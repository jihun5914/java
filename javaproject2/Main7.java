package Javaproject;

class Memo {
    private String name;
    private String time;
    private String content;

    // 생성자
    public Memo(String name, String time, String content) {
        this.name = name;
        this.time = time;
        this.content = content;
    }

    // 작성자 이름 반환
    public String getName() {
        return name;
    }

    // 작성자가 같은지 확인
    public boolean isSameName(Memo other) {
        return this.name.equals(other.getName());
    }

    // 메모 내용 출력
    public void show() {
        System.out.println("[" + time + "] " + name + ": " + content);
    }

    // 메모 내용의 길이 반환
    public int length() {
        return content.length();
    }
}

public class Main7 {
    public static void main(String[] args) {
        Memo a = new Memo("박지성", "10:10", "자바 과제 있음");
        Memo b = new Memo("박지성", "10:15", "자바 과제를 꼭 완료하자");
        Memo c = new Memo("김경미", "11:30", "다른 사람이 작성한 메모");

        // 메모 내용 출력
        a.show();
        
        // 작성자가 같은지 확인
        if (a.isSameName(b)) {
            System.out.println("동일한 사람입니다.");
        } else {
            System.out.println("다른 사람입니다.");
        }

        // c 작성자 이름 출력 및 메모 길이 확인
        System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
    }
}
