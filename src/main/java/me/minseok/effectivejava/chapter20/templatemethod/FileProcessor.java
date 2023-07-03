package me.minseok.effectivejava.chapter20.templatemethod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BiFunction;

public abstract class FileProcessor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    // 템플릿 메서드 패턴
    public final int process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    // 템플릿 콜백 패턴
    /*
    public final int process(BiFunction<Integer, Integer, Integer> operator) {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = operator.apply(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }
    */

    // 템플릿 메서드에서 사용되는 메서드; 서브클래스에서 확장할 수 있도록 제공
    protected abstract int getResult(int result, int number);

}
