package me.minseok.effectivejava.chapter07;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class PhantomReferenceExample {
    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        SoftReference<Object> soft = new SoftReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        /*
            Strong reference가 없고 soft reference만 남았을 경우,
            메모리가 부족할 경우에 gc 대상이 된다.
         */
        System.out.println(soft.get());

        strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(strong);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        /*
            Strong reference가 없고 weak reference만 남았을 경우,
            바로 gc 대상이 된다.
         */
        System.out.println(weak.get());

        StringObject strongObject = new StringObject();
        ReferenceQueue<StringObject> referenceQueue = new ReferenceQueue<>();
        StringObjectReference<StringObject> phantomReference = new StringObjectReference<>(strongObject, referenceQueue);
        strongObject = null;

        System.gc();
        Thread.sleep(3000L);

        /*
            Phantom reference를 queue에 넣어둔다.
         */
        System.out.println(phantomReference.isEnqueued());

        Reference<? extends StringObject> phantomObject = referenceQueue.poll();
        phantomObject.clear();
        System.out.println(phantomObject);
    }
}
