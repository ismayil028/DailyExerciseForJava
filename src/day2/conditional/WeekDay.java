package day2.conditional;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        System.out.println(getWeekDay(day));
    }

    public static String getWeekDay(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Bazar Ertəsi"; break;
            case 2: dayName = "Çərşənbə Axşamı"; break;
            case 3: dayName = "Çərşənbə "; break;
            case 4: dayName = "Cümə Axşamı"; break;
            case 5: dayName = "Cümə"; break;
            case 6: dayName = "Şənbə"; break;
            case 7: dayName = "Bazar"; break;
            default:dayName = "Duzgun reqem Daxil edin 1-7 arasinda";
        }

        return dayName;
    }
}
