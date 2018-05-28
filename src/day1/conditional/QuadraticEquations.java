package day1.conditional;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) {
        System.out.println("Kvadrat tenlik hesablayan proqrama xos gelmisiniz :) ");
        Scanner sc = new Scanner(System.in);
        double a, b, c, result, r1, r2;
        System.out.print("a-ni daxil edin: ");
        a = sc.nextDouble();
        System.out.print("b-ni daxil edin: ");
        b = sc.nextDouble();
        System.out.print("C-ni daxil edin: ");
        c = sc.nextDouble();
        result = b * b - (4.0 * a * c);

        if (result > 0.0) {
            r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println(" Kokleri : " + r1 + " , " + r2);
        } else if (result == 0.0) {
            r1 = -b / (2.0 * a);
            System.out.println("Koku : " + r1);
        } else {
            System.out.println("Tenliyin koku yoxdur");
        }

    }
}
