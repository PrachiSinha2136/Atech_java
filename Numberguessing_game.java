import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Numberguessing_game {
    public static void main(String[] args){
        Random ram=new Random();
        int num = ram.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int user_input;
        int attempts=0;
        boolean matched= false;
        while(!matched){
            System.out.print("Enter a number:");
            System.out.println("Number of attempts:" +attempts);
            user_input=sc.nextInt();
            if(user_input==num) {
                System.out.println("You guessed it right! You win!");
                matched = true;
            } else if (user_input>num) {
                System.out.println("Think small!Better luck next time.");
                attempts++;
            }else{
                System.out.println("Think big!Better luck next time.");
                attempts++;
            }

        }
    }
}
