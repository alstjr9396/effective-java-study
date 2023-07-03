package me.minseok.effectivejava.chapter20.typeframework;

// 서로 관계없는 인터페이스를 조합해서 새로운 타입으로 만들수 있다.
public interface SingerSongwriter extends Singer, Songwriter{

    AudioClip strum();
    void actSensitive();
}
