package me.minseok.effectivejava.chapter08;

public class CloseableExample {

    public static void main(String[] args) {
        try(CloseableObject closeableObject = new CloseableObject()) {
            // 자원 반납 처리 됨
        }
    }
}
