package day1.basic;

import java.util.Scanner;

public class PoligonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("polygon = (n*s^2)/(4*tan(π/n))");
        System.out.print("Bucagini teyin edin: ");
        int bucaq = sc.nextInt();
        System.out.print("Uzunlugu teyin edin: ");
        int uzun = sc.nextInt();
        double result = (bucaq * uzun *uzun)/ (4* Math.tan(Math.PI/bucaq));
        System.out.println(bucaq+" bucaqlinin sahesi : " + result);
    }
}
