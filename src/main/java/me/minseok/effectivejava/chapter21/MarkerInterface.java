package me.minseok.effectivejava.chapter21;

public interface MarkerInterface {

    default void hello() {
        System.out.println("hello interface");
    }

}
