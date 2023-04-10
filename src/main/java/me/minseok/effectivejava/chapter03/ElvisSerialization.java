package me.minseok.effectivejava.chapter03;

import java.io.*;

public class ElvisSerialization {

    // 직렬화 - 역직렬화로 여러 인스턴스를 생성할 수 있어 싱글턴을 보증하지 못한다.
    public static void main(String[] args) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"));
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"));
            Elvis elvis = (Elvis) in.readObject();
            System.out.println(elvis == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
