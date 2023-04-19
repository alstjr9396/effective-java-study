package me.minseok.effectivejava.chapter07;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = Executors.newCachedThreadPool();
        int processors = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(processors);
        for (int i = 0; i < 100; i++) {
            service.submit(new Task());
        }

        Future<String> submit = service.submit(new CallableTask());
        System.out.println(submit.get());

        service.shutdown();
    }
}
