package javaBasics;

import java.util.Scanner;

/**
 * بىز ئاپتۇماتىك پۇل ئېلىش ماشىنىسىنىڭ سىستېمىسىنى لايىھىلەپ باقايلى
 * قەشقەرچە سۆزلىسۇن
 */
public class javaIfStatement3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Mehpiy nomurini chiguzsile..");
        int kirguzgenNomur = scan.nextInt();
        int mehpiynomur = 123456789;
        int burunQoyghanPul = 9000;

        if (kirguzgenNomur == mehpiynomur) {
            System.out.println("nechche pul lazimti..");
            int lazimliqPul = scan.nextInt();
            if (burunQoyghanPul > lazimliqPul) {
                System.out.println(String.format("sile alidighan pul %d miti... alsila...", lazimliqPul));
                System.out.println(String.format("Qep qalghan pulliri %d iken juma yene.. ", burunQoyghanPul - lazimliqPul));
            } else if (burunQoyghanPul < lazimliqPul) {
                System.out.println("Yotqangha qarap put uzitili..");
            } else {
                System.out.println("pul qalmidi.. yene kelgende ashqan pulni salghudek somka elip kelale..");
            }
        } else {
            System.out.println("Mehpit nomurnh men dewitiymu ya..");
        }
    }
}
