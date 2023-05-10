package me.minseok.effectivejava.chapter14.composition;

public class Point implements Comparable<Point> {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point point) {
        int result = Integer.compare(this.x, point.x);
        if (result == 0) {
            result = Integer.compare(this.y, point.y);
        }
        return result;
    }
}
