package day1.basic;

import java.util.Scanner;

public class AsciiToLetter {
    public static void main(String[] args) {
        System.out.print("Write the digit");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int  a = Character.getNumericValue(c);
        System.out.println("Ascii Value of " + c + " " + a);
    }
}
