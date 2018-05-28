package day1.basic;

import java.nio.charset.Charset;

public class AllCharset {
    public static void main(String[] args) {
        System.out.println("Butun CharSet-ler");
        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
    }
}
