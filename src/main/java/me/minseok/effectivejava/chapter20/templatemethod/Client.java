package me.minseok.effectivejava.chapter20.templatemethod;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        System.out.println(fileProcessor.process());

        // 메서드 콜백 패턴 사용
        //System.out.println(fileProcessor.process(Integer::sum));
    }
}
