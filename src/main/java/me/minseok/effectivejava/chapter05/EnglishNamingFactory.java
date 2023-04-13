package me.minseok.effectivejava.chapter05;

public class EnglishNamingFactory implements NamingServiceFactory{
    @Override
    public NamingService getNamingService() {
        return new EnglishNamingService();
    }
}
