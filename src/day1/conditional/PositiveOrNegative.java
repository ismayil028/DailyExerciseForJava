package day1.conditional;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write number You want to know it is Positive or Negative ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive");
        }else{System.out.println("Negative");}
    }
}
