package javaBasics;

public class casting_String {
    public static void main(String[] args) {
        /*
        double x=15.1254752;
        int z = (int) x;
        System.out.println(z);

        int x= 15;
        int y= ++x; //  y=1+x
        int z= --y;


        int x = 191;
         x  %=  19; // x = x % 19;
        System.out.println(x);



        int x= 15;
        int y=16;
        System.out.println(!(x>y && x==15));
         */



        String salam="     Essalam alaykum!      ";
        int x= 15 + salam.length() +salam.indexOf("!");
        System.out.println(String.format("%d =  %d + %d + %d",x,15,salam.length(),salam.indexOf("!")));


        String x1="\033[0;31m My name is ahmet.\033[0m He saidcome on! \f and went.";
        String x2="19";
        System.out.println(x1);

        // int x3= Integer.parseInt(x2);
        //System.out.println(x3);
       // System.out.println(x1 + x2);
        //System.out.println(String.format("%d = %d + %d",x3,x2,x1));
        //System.out.println(String.format("Chiqqan netije %d Ge %d ni qoshup " +
               // "chiqarcgan %d netijisidur.",x1,x2,x3));

        //System.out.println(x1+x2);







    }
}
