package me.minseok.effectivejava.chapter07;

public class Task implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread());
    }
}
