package Javaproject;

class Cube {
    private int width, height, depth;

    // 생성자
    public Cube(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // 부피를 반환하는 메서드
    public int getVolume() {
        return width * height * depth;
    }

    // 가로, 세로, 높이를 증가시키는 메서드
    public void increase(int w, int h, int d) {
        width += w;
        height += h;
        depth += d;
    }

    // 부피가 0인지 확인하는 메서드
    public boolean isZero() {
        return getVolume() == 0;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());

        cube.increase(1, 2, 3);
        System.out.println("큐브의 부피는 " + cube.getVolume());

        if (cube.isZero()) {
            System.out.println("큐브의 부피는 0");
        } else {
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}
