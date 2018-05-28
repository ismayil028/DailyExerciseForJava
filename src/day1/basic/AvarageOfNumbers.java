package day1.basic;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AvarageOfNumbers {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ne qeder ededin ortasini tapmaq isteyirsiniz? : ");
        int q = sc.nextInt();
        double cavab = avarage((double) q);

    }

    public static double avarage(double say) {
        double result = 0;
        int reqem = 0;
        if (say > 0) {
            for (int j = 1; j <= say; j++) {
                System.out.print(j + ". eded : ");
                reqem += sc.nextInt();
            }
            result = ((double) reqem) / say;
            System.out.println(say + " ededin ortalamasi " + result);
        } else {
            System.out.println("0-dan boyuk eded yazin");
        }
        return result;
    }

}
