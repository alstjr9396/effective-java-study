package me.minseok.effectivejava.chapter05;

// 팩터리 메서드 패턴을 사용하면 클라이언트 코드는 변경할 필요가 없다.
public class FactoryNamingUtils {

    private NamingService namingService;

    public FactoryNamingUtils(NamingServiceFactory namingServiceFactory) {
        namingService = namingServiceFactory.getNamingService();
    }

    public int getLength(String name) {
        return namingService.getLength(name);
    }
}
