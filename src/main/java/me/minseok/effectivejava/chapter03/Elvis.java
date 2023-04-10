package me.minseok.effectivejava.chapter03;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    public static final Elvis INSTANCE = new Elvis();

    private static boolean created;

    /**
     * 리플렉션을 통한 싱글턴 인스턴스 생성 방지
     * @see ElvisReflection#main(String[])
     */
    private Elvis() {
        if (created) {
            throw new UnsupportedOperationException("Can't be created by constructor.");
        }

        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("Leaving the building.");
    }

    public void sing() {
        System.out.println("Singing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    /**
     * 역직렬화할때 사용되는 메서드
     * 역직렬화를 통한 싱글턴 인스턴스 생성 방지
     * @see ElvisReflection#main(String[])
     * @return Elvis
     */
    private Object readResolve() {
        return INSTANCE;
    }
}
