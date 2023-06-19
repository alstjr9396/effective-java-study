package me.minseok.effectivejava.chapter17.part1;

public class StringExample {

    public static void main(String[] args) {
        String name = "whiteship";

        // 값의 변경이 자주 일어나는 경우 '가변 동반 클래스'를 제공하여 대체할 수 있다.
        StringBuilder nameBuilder = new StringBuilder(name);
        nameBuilder.append("keesun");
    }
}
