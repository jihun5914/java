package Javaproject;

import java.util.Scanner;

class Grade {
    private String name;
    private int javaScore;
    private int webScore;
    private int osScore;

    public Grade(String name, int java, int web, int os) {
        this.name = name;
        this.javaScore = java;
        this.webScore = web;
        this.osScore = os;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (javaScore + webScore + osScore) / 3.0;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 점수를 입력하세요: ");
        String name = scanner.next();
        int java = scanner.nextInt();
        int web = scanner.nextInt();
        int os = scanner.nextInt();

        Grade student = new Grade(name, java, web, os);
        System.out.println(student.getName() + "의 평균은 " + student.getAverage());

        scanner.close();
    }
}
