package day1.basic;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Ededleri daxil edin: ");
        System.out.print("1. eded: ");
        a = sc.nextInt();
        System.out.print("2. eded: ");
        b = sc.nextInt();
        System.out.println("Yer deyismeden evvel reqemler : a , b = " + a + "," + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Yed deyismeden sonra reqemler: a , b = " + a + "," + b);
    }
}
