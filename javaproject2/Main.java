package Javaproject;

class TV {
    private String brand;
    private int price;
    private int size;

    // 생성자
    public TV(String brand, int price, int size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    // show 메서드
    public void show() {
        System.out.println(brand + "에서 만든 " + price + "만 원짜리 " + size + "인치 TV");
    }
}

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", 300, 50);
        tv.show();
    }
}

