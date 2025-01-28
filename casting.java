class casting {
    public static void main(String[] args){
        // Implicit casting
        int num= 10;
        float n= num;
        System.out.println(n);
        double d= num;
        System.out.println(d);
        long l= num;
        System.out.println(l);

        float v=11.00f;
        double o=v;
        System.out.println(o);

        long g=50;
        float flo=g;
        System.out.println(flo);
        double dou=g;
        System.out.println(dou);

        short s=5;
        int i= s;
        System.out.println(i);
        long lon=s;
        System.out.println(lon);
        double a=s;
        System.out.println(a);
        float b=s;
        System.out.println(b);

        byte byt=3;
        int c=byt;
        System.out.println(c);

        //explicit casting
        float h=5.9999f;
        int j=(int) h;
        System.out.println(j);
        char k= (char) h;
        System.out.println(k);



    }
}
