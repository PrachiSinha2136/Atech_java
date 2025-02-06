import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number!!Enter number between 1-7");
        }
        que(i);
    }
    public static int que(int i) {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to know previous and next day? (Y or N) ");
        String ans = s.next();
        switch (ans) {
            case "Y":
                System.out.println("Previous day : " + know(i - 1));
                System.out.println("Next day : " + know(i + 1));
                break;
            case "N":
                break;
        }
        return 0;
    }

    public static String know(int i) {
        switch(i) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thrusday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
        }
        return "None";
    }
}
