package me.minseok.effectivejava.chapter17.memorymodel;

public class MemoryModelExample {

    final int x;
    int y;
    static MemoryModelExample m;

    public MemoryModelExample() {
        x = 3;
        y = 4;
    }

    static void writer() {
        m = new MemoryModelExample();
    }

    static void reader() {
        if (m != null) {
            int i = m.x; // m.x가 3임을 보장한다.
            int j = m.y; // m.y는 0일 수 있다.(초기화 x)
        }
    }
    public static void main(String[] args) {
         /*
            Object m = new MemoryModelExample()
            m.x = 3
            m.y = 4
            example = m
         */

        // 불안정한 초기화가 발생할 수 있다.
        /*
            Object m = new MemoryModelExample()
            m.x = 3
            example = m
            m.y = 4
         */

        // final을 사용한다면 스펙 상 필드가 초기화가 된 이후에만 다른 쓰레드에서 사용가능하다.
        // 불안정한 초기화 방지할 수 있다.
        MemoryModelExample example = new MemoryModelExample();
    }


}
