import java.util.Scanner;

public class recursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i= sc.nextInt();
        System.out.println("The sum of Natural numbers: "+sumofNno(i));

    }
    public static int sumofNno(int i){
        if(i==0){
            return 0;
        }else{
            return i+sumofNno(i-1);
        }
    }
}

