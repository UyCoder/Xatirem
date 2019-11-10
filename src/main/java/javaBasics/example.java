package javaBasics;

import java.time.LocalTime;

public class example {
    public static void main(String[] args) {
        int currentHour = LocalTime.now().getHour();
        if (currentHour > 8 && currentHour < 12) {
            System.out.println("ئەتىگەنلىكىڭىز خەيلىك بولسۇن");
        } else if (currentHour == 12) {
            System.out.println("چۈشلىكىڭىز خەيلىك بولسۇن");
        }
         else
        {
        System.out.println("كەچلىكىڭىز خەيلىك بولسۇن");
        }
}

//        int san1=17;
//        int san2=18;
//        int result=(san1>san2) ? san1 : san2 ;
//        System.out.println(result);


//    public static void main(String[] args) {
//        // بىرىنچى سان كىرگۈزىدىغان سكانىر قوشتۇق
//        Scanner scan = new Scanner(System.in);
//        System.out.println("بىر سان كىرگۈزۈڭ");
//        int birinchiSan=scan.nextInt();
//
//        // ئىككىنچى سان قوشىىدىغان سكانىر قوشتۇق
//        System.out.println("ئىككىنچى ساننى كىرگۈزۈڭ");
//        int ikkinchiSan=scan.nextInt();
//
//        // كودىمىزغا if شەرتلىك جۈملىسىنى قوشتۇق
//        if(birinchiSan>ikkinchiSan);
//        {
//            System.out.println("");
//        }
//
//        System.out.println("");
//        /**
//         * ئەگەر ساننى ھەرپكە ئايلاندۇرماقچى بولساق:
//         * String.valueOf("15")
//         *
//         * ئەگەر ھەرپنى سانغا ئايلاندۇرماقچى بولساق:
//         * Integer.parseInt("15");
//         *
//    }    */
//






}
