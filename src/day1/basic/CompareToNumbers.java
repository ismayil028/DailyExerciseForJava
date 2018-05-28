package day1.basic;

import java.util.Scanner;

public class CompareToNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci ededi girin :");
        int ist = sc.nextInt();
        System.out.print("2ci ededi girin :");
        int wnd = sc.nextInt();
        if(ist!=wnd ){
            System.out.println(ist + " != " + wnd);
        }else {System.out.println(ist + " == " + wnd);}
        if(ist<wnd){System.out.println(ist + " < " + wnd);}
        else{ System.out.println(ist + " > " + wnd );}
        if(ist <= wnd){System.out.println(ist + " <= " + wnd);}
        else{ System.out.println(ist + " >= " + wnd );}
    }
}
