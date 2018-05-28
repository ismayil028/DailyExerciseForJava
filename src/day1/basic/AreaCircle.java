package day1.basic;

import java.util.Scanner;

public class AreaCircle {

    static public double area(double radius) {

        double ab = Math.PI * radius * radius;
        return ab;
    }

    static public double perimeter(double radius) {
        double peri = Math.PI * 2 * radius;
        return peri;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 0;
        r = sc.nextDouble();
        System.out.println("Area is " + area(r));
        System.out.println("Perimeter is " + perimeter(r));
    }
}
