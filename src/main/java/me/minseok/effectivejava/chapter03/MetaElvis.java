package me.minseok.effectivejava.chapter03;

public class MetaElvis<T> {

    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis() {
    }

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance() {
        return (MetaElvis<T>) INSTANCE;
    }

    public void sing(T t) {
        System.out.println(t);
    }

    public void leaveTheBuilding() {
        System.out.println("Leaving the building.");
    }

    // 제너릭 싱글톤 펙토리를 사용하면 동일한 인스턴스를 원하는 타입으로 형변환이 가능하다.
    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
    }
}
