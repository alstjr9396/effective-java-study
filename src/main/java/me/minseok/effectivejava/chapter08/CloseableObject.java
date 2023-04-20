package me.minseok.effectivejava.chapter08;

public class CloseableObject implements AutoCloseable{

    // try-with-resources에서 실행됨
    @Override
    public void close() {
        System.out.println("Clean the resources");
    }
}
