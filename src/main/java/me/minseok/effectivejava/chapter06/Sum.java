package me.minseok.effectivejava.chapter06;

public class Sum {

    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            // 불필요한 오토박싱이 발생한다.
            // long to Long
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long x = 0;

        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            x += sum();
            long end = System.nanoTime();
            System.out.println((end - start) / 1_000_000. + " ms.");
        }

        if (x == 42) {
            System.out.println();
        }
    }
}
