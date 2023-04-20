package me.minseok.effectivejava.chapter08;

import java.util.List;

public class CleanerObject {

    private List<String> resources;

    public CleanerObject(List<String> resources) {
        this.resources = resources;
    }

    public static class ResourceCleaner implements Runnable {

        private List<String> cleanableResources;

        public ResourceCleaner(List<String> cleanableResources) {
            this.cleanableResources = cleanableResources;
        }

        @Override
        public void run() {
            cleanableResources = null;
            System.out.println("Clean the resources");
        }
    }
}
