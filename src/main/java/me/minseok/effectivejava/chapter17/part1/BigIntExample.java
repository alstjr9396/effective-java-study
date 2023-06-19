package me.minseok.effectivejava.chapter17.part1;

import java.awt.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class BigIntExample {

    public static void main(String[] args) {
        // 불변 객체 끼리는 내부 데이터를 공유할 수 있다.
        BigInteger ten = BigInteger.TEN;
        BigInteger minusTen = ten.negate();

        final Set<Point> points = new HashSet<>();
        Point firstPoint = new Point(1, 2);
        points.add(firstPoint);

    }
}
