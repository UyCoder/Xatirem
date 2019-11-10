package javaBasics;

import java.util.Scanner;

/**
 * بىز ئىمتىھاندا ئالغان نومۇرنى كىرگۈزسەك،
 * بىزنىڭ نومۇرىمىزنى باھالاپ بەرسۇن..
 */
public class javaIfStatement2 {
    public static void main(String[] args) {
        // add scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("نەتىجىڭىزنى كىرگۈزۈڭ..");
        int kirguzgenNetije= scan.nextInt();

        // add if statement
        if (kirguzgenNetije<=100 && kirguzgenNetije>=90){
            System.out.println("سىز ۋەھشىي ياخشى ئوقۇغۇچى ئىكەنسىز.. تونۇماي قاپتۇق سىزنى..");
        } else if (kirguzgenNetije > 75 && kirguzgenNetije < 90){
            System.out.println(" يامان ئەمەس... ");
        } else if (kirguzgenNetije >= 60 && kirguzgenNetije <= 75)
        {
            System.out.println("تاس قاپسىز ئۆتەلمىگىنى.. تېرىشارسىز.. قالدۇق قالماڭ يەنە..");
        } else
        {
            System.out.println(" سىز ئوقۇيمەن دېمەي.. قىلالايدىغان ئىشنى سىناپ بېقىڭ..");
        }
    }
}
