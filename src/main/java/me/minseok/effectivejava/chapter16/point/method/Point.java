package me.minseok.effectivejava.chapter16.point.method;

// package-private 클래스 또는 private 중첩 클래스라면 데이터 필드를 노출해도 문제 없다.
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        // 접근 메서드를 사용하면 부수 작업을 할 수 있다.
        x *= 3;
        return x;
    }
    public double getY() { return y; }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) { this.y = y; }
}
