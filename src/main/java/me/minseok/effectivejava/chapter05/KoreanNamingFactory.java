package me.minseok.effectivejava.chapter05;

public class KoreanNamingFactory implements NamingServiceFactory{
    @Override
    public NamingService getNamingService() {
        return new KoreanNamingService();
    }
}
