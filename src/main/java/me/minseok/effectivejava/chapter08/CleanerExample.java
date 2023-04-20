package me.minseok.effectivejava.chapter08;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class CleanerExample {

    public static void main(String[] args) throws InterruptedException {
        Cleaner cleaner = Cleaner.create();

        List<String> resources = new ArrayList<>();
        CleanerObject cleanerObject = new CleanerObject(resources);
        cleaner.register(cleanerObject, new CleanerObject.ResourceCleaner(resources));

        cleanerObject = null;
        System.gc();
        Thread.sleep(3000L);
    }
}
