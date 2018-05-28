/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.basic;

import java.util.Scanner;

/**
 *
 * @author ismayil
 */
public class AreaPeriRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesablamaq istediyiniz dordbucaglinin eni? :");
        int en = sc.nextInt();
        System.out.println("Hesablamaq istediyiniz dordbucaqlinin uzunlugu? :");
        int uzunluq = sc.nextInt();
        double sahe = area((double) en, (double) uzunluq);
        double peri = perimeter((double) en, (double) uzunluq);
        System.out.println("Yazdiginiz 4 bucaqlinin sahesi : " + sahe);
        System.out.println("Yazdiginiz 4 bucaqlinin Perimetri" + peri);
    }

    public static double area(double en, double uzunluq) {
        return en * uzunluq;
    }

    public static double perimeter(double en, double uzunluq) {
        return 2 * (en + uzunluq);
    }

}
