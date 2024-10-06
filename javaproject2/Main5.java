package Javaproject;

class Song {
    private String title;
    private String singer;
    private int year;
    private String country;

    // 생성자
    public Song(String title, String singer, int year, String country) {
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }

    // 노래 정보를 출력하는 메소드
    public void show() {
        System.out.println(year + "년 " + country + " 가수 " + singer + "가 부른 " + title);
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Song 객체 생성
        Song song = new Song("가로수 그늘 아래 서면", "이문세", 1988, "한국");

        // 노래 정보 출력
        song.show();
    }
}
