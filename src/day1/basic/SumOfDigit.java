package day1.basic;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ededi daxil edin : ");
    long  eded = in.nextLong();
        int result = 0;
        while (eded!=0){
        result += eded%10;
        eded = eded/10;
        }
        System.out.println("Ededlerinin cemi " + result);
    }
}
