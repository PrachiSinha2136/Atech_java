
import java.util.Scanner;
public class Take_input {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Integer value ");
        int a= sc.nextInt();
        System.out.print("Enter a float value ");
        float b= sc.nextFloat();
        System.out.print("Enter a string ");
        String c= sc.next();
        System.out.println("Int " +a);
        System.out.println("float " +b);
        System.out.println("String " +c);
    }
}
