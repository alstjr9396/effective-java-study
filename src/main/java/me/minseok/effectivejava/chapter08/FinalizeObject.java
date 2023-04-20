package me.minseok.effectivejava.chapter08;

public class FinalizeObject {

    @Override
    protected void finalize() throws Throwable {
        System.out.print("");
    }
}
