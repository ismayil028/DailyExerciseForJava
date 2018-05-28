package day1.basic;

import java.util.Scanner;

public class TwoNumberAllAction {

    public static void main(String[] args) {
        System.out.print("Ilk reqemi daxil edin: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int ilk = sc.nextInt();
        System.out.print("Ikinci ededi daxil edin: ");
        int iki = sc.nextInt();
        System.out.println("Toplayanda " + ilk + " + " + iki + " = " + (ilk + iki));
        System.out.println("Cixdiqda " + ilk + " - " + iki + " = " + (ilk - iki));
        System.out.println("Vurduqda " + ilk + " * " + iki + " = " + (ilk * iki));
        System.out.println("Boldukde " + ilk + " / " + iki + " = " + (ilk / iki));
        System.out.println("Modladiqda " + ilk + " % " + iki + " = " + (ilk % iki));
    }

}
