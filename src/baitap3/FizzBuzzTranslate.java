package baitap3;

public class FizzBuzzTranslate {
    public static String translate(int number){
        if (number%3 == 0 && number%5 == 0){
            return "FizzBuzz";
        }
        if (number%5==0){
            return "Buzz";
        }
        if (number%3==0){
            return "Fizz";
        }
        else {
            return number+"";
        }
    }
}
