package me.minseok.effectivejava.chapter18.callback;

class BobFunction implements FunctionToCall {

    private final Service service;

    public BobFunction(Service service) {
        this.service = service;
    }

    @Override
    public void call() {
        System.out.println("밥을 먹을까..");
    }

    @Override
    public void run() {
        /*
            this; 오직 자신의 인스턴스
            래퍼로 감싸고 있는 내부 객체가 어떤 클래스의 콜백으로 사용되는 경우에
            this를 전달한다면, 해당 클래스는 래퍼가 아닌 내부 객체를 호출한다.
         */
        this.service.run(this);
    }
}
