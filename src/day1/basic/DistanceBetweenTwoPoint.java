package day1.basic;

import java.util.Scanner;

public class DistanceBetweenTwoPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))");
        double r = 6371.01;
        System.out.print("1ci kordinatin latitude-sini daxil edin : ");
        double x1= Math.toRadians(sc.nextDouble());
        System.out.print("1ci kordinatin longtitude-sini daxil edin : ");
        double y1 = Math.toRadians(sc.nextDouble());
        System.out.println("2ci kordinatin latitude-sini daxil edin :");
        double x2 = Math.toRadians(sc.nextDouble());
        System.out.println("2ci kordinatin longtitude-sini daxil edin :");
        double y2 = Math.toRadians(sc.nextDouble());
        double result  = r * Math.acos((Math.sin(x1) * Math.sin(x2)) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2));
        System.out.println(result);
     }
}
