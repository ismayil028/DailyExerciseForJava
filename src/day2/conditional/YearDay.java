package day2.conditional;

import java.util.Scanner;

public class YearDay {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int gunSayi = 0 ;
        String MonthOfName = "Unknown";
        System.out.println("Input a month Number");
        int month  = sc.nextInt();
        System.out.println("Input a Year Number");
        int year = sc.nextInt();
        String error ="";
        switch(month){
            case 1:
                MonthOfName = "January";
                gunSayi = 31;
                break;
            case 2: 
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    gunSayi = 29;
                } else {
                    gunSayi = 28;
                }
                break;
            case 3: 
                MonthOfName = "March";
                gunSayi = 31;
                break;
            case 4: 
                MonthOfName  ="April";
                gunSayi = 30;
                break;
            case 5: 
                MonthOfName = "May";
                gunSayi = 31;
                break;
            case 6: 
                MonthOfName = "June";
                gunSayi = 30;
                break;
            case 7:
                MonthOfName = "July";
                gunSayi =   31;
                break;
            case 8:
                MonthOfName = "August";
                gunSayi = 31;
                break;
            case 9:
                MonthOfName = "September";
                gunSayi = 30;
                break;
            case 10:
                MonthOfName = "October";
                gunSayi = 31;
                break;
            case 11:
                MonthOfName = "November";
                gunSayi = 30;
                break;
            case 12: 
                MonthOfName = "December";
                gunSayi = 31;
                break;
            default: 
                error ="Input is not VAlID";
                
        }
        if (error.isEmpty()) {
           System.out.print(MonthOfName + " " + year + " has " + gunSayi + " days\n");
        }else {
            System.out.println(error);
        }
    }
}
