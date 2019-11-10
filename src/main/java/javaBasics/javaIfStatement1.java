package javaBasics;

import java.util.Scanner;

/**
 * بىز تۇغۇلغان يىلىمىزنى كىرگۈزسەك،
 * بۇ يىل قانچە ياشقا كىرگىنىمىزنى دەپ بەرسۇن.
 */
public class javaIfStatement1 {
    public static void main(String[] args) {
        // سكانىرنى قوشۇش
        Scanner scan = new Scanner(System.in);
        System.out.println("تۇغۇلغان يىلىڭىزىنى كىرگۈزۈڭ..");
        int tughulghanYil = scan.nextInt();

        //نۆۋەتتىكى يىلنى چىقىرىمىز.
        int buYil = java.time.LocalDate.now().getYear();

        // قانچە ياشقا كىرگىنىنى ھېسابلاپ چىقىرپ بېرىدۇ
        System.out.println("بۇ يىل كىرگەن يېشىڭىز... ");
        System.out.println(buYil - tughulghanYil);
        int yash = buYil - tughulghanYil;

        if (yash < 18) {
            System.out.println("سىز تېخى ئۆسمۈر ئىكەنسىز");
        } else if (yash > 18 && yash < 40) {
            System.out.println(" سىز دەل ياشلىقىڭىزدا ئىكەنسىز .. قاتتىق تىرىشىڭ!!!");
        } else {
            System.out.println("سىز قېرىپ قاپسىز");
        }

    }
}
