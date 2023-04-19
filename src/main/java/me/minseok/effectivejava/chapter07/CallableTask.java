package me.minseok.effectivejava.chapter07;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    @Override
    public String call() throws Exception {
        return String.valueOf(Thread.currentThread());
    }
}
