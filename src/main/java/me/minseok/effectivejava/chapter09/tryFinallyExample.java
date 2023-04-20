package me.minseok.effectivejava.chapter09;

import java.io.*;

public class tryFinallyExample {

    private static final int BUFFER_SIZE = 8 * 1024;

    /*
        내부 try-finally 블록에서 예외가 발생하고 외부 try-finally 블록에서 예외가 발생하면
        마지막에 발생한 예외만 노출된다.
     */
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("d:/fake/location");
        try {
            OutputStream out = new FileOutputStream("d/fake/location");
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
