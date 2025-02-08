public class Factorial {
    public static void main(String[] args){
    int i= 6;
        System.out.println("Factorial is: "+fac(i));
    }
    public static int fac(int i){
        if(i==0){
            return 1;
        }else{
            return i * fac(i-1);
        }
    }
}
