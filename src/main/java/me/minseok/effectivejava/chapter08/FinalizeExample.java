package me.minseok.effectivejava.chapter08;

import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;

public class FinalizeExample {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        int i = 0;
        while (true) {
            i++;

            new FinalizeObject();

            if ((i % 1_000_000) == 0) {
                Class<?> finalizerClass = Class.forName("java.lang.ref.Finalizer");
                Field queue = finalizerClass.getDeclaredField("queue");
                queue.setAccessible(true);
                ReferenceQueue<Object> referenceQueue = (ReferenceQueue) queue.get(null);

                Field queueLength = ReferenceQueue.class.getDeclaredField("queueLength");
                queueLength.setAccessible(true);
                long length = (long) queueLength.get(referenceQueue);
                System.out.format("There are %d references in the queue\n", length);
            }
        }
    }
}
