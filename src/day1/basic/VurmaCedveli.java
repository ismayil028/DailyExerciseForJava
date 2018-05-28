package day1.basic;

import java.util.Scanner;

public class VurmaCedveli {

    public static int eded;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vurma cedvelini gormek istediyiniz reqemi daxil edin : ");
        eded = sc.nextInt();
        if (!(eded <= 0) && !(eded > 11)) {
            for (int i = 0; i < 10; i++) {
                System.out.println(eded + " x " + i + " = " + (eded * i));
            }
        } else {
            System.out.println("1 - 10 araliqinda eded daxil etmeyiniz xahis olunur");
            main(args);
        }

    }
}
