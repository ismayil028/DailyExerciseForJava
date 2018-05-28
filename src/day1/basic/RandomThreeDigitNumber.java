package day1.basic;

public class RandomThreeDigitNumber {
    public static void main(String[] args) {
        int amount = 0;
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                for(int k = 1; k <= 6; k++){
                    if(k != i && k != j && i != j){
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + amount);
    }
}
