package me.minseok.effectivejava.chapter16.point.field;

// public class일 경우..
public class Point {
    public double x;
    public double y;

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 10;
        point.y = 20;

        // 클라이언트 코드가 필드를 직접 사용하면 캡슐화의 장점을 제공하지 못한다.
        System.out.println(point.x);
        System.out.println(point.y);
    }
}
