public class methodoverloading {
    public static void main(String[] args){
        s(5,6,7);
        s(8,9);
        s(5.0f,6.0f,7.0f);
    }
    public static void s(int a,int b,int c){
        System.out.println("Sum of three integer value : "+(a+b+c));
    }
    public static void s(int a,int b){

        System.out.println("Sum of two integer value : "+(a+b));
    }
    public static void s(float a,float b,float c){
        System.out.println("Sum of three float value : "+(a+b+c));
    }
}

