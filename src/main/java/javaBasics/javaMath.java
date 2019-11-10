package javaBasics;

import java.util.Scanner;

public class javaMath {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in); // سىكانىر قوشىمىز
        System.out.println("برىنچى ساننى كىرگۈزۈڭ"); // خەت چىقىرىمىز
        int kirguzgenSan = x.nextInt(); // سىستېمىغا تونۇتىمىز

        System.out.println(" ئىككىنچى ساننى كىرگۈزۈڭ ");
        int kirguzgenSan2= x.nextInt();

        int i= (int) Math.random();
        System.out.println(String.format("ئىككى ساننىڭ چوڭ %d دۇر." + " بۇ ئىككى ساننىڭ بىرىنچىسى %d ئىدى. ئىككىنچىسى بولسا %d ئىدى.", Math.max(kirguzgenSan,kirguzgenSan2),kirguzgenSan,kirguzgenSan2));
        System.out.println("ئىككى ساننىڭ چوڭى "+ Math.max(kirguzgenSan,kirguzgenSan2) + " دۇر.");
        System.out.println(String.format("ئىككى ساننىڭ كىچىكى %d دۇر." + " بۇ ئىككى ساننىڭ بىرىنچىسى %d ئىدى. ئىككىنچىسى بولسا %d ئىدى.", Math.min(kirguzgenSan,kirguzgenSan2),kirguzgenSan,kirguzgenSan2));
        System.out.println(String.format(" بۇ سانننىڭ يىلىتىز  %.2f چىقىدۇ", Math.sqrt(kirguzgenSan)));
        System.out.println(String.format(" بۇ ساننىڭ مۇتلەق قىممىتى %d چىقىدۇ.",Math.abs(kirguzgenSan2)));
        System.out.println(String.format("سىستېما چىقىرىپ بەرگەن خالىغان سان %d دۇر.", i));


    }
}
