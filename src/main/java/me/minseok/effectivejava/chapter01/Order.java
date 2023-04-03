package me.minseok.effectivejava.chapter01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Order {

    private boolean isCard;

    private boolean isPoint;

    private Product product;

    private static final Order ORDER = new Order();

    public static Order orderByCard(Product product) {
        Order order = new Order();
        order.isCard = true;
        order.product = product;
        return order;
    }

    public static Order orderByPoint(Product product) {
        Order order = new Order();
        order.isPoint = true;
        order.product = product;
        return order;
    }

    public static Order getInstance() {
        return ORDER;
    }
}
