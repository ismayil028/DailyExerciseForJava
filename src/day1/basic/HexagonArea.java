package day1.basic;

import java.util.Scanner;

public class HexagonArea {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("hexagon sahesi = (6 * s^2)/(4*tan(π/6))");
        System.out.print("S daxil edin: ");
        int s =  in.nextInt();
        double result = (6 * s*s)/ (4* Math.tan(Math.PI/6));
        System.out.println("Cavab: " + result);
    }

}
