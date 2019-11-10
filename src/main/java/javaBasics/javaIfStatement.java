package javaBasics;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class javaIfStatement {
    public static void main(String[] args){
        // سىستىمنىڭ ئىچىدىن ۋاقىتنى تارتىپ چىقىپ، بۇنىڭ سائەت سانىنى پۈتۈن سان قىلىپ ئۋلىۋالدۇق
        int nowettikiSaat= java.time.LocalTime.now().getHour();

        if(nowettikiSaat>8 && nowettikiSaat<12) {
            System.out.println("ئەتىگەنلىكىڭىز خەيرلىك بولسۇن!");
        } else if (nowettikiSaat ==12){
            System.out.println("چۈشلۈكىڭىز خەيرلىك بولسۇن!");
        } else if (nowettikiSaat > 12 && nowettikiSaat < 22 )
        {
            System.out.println("كەچلىكىڭىز خەيرلىك بولسۇن");
        } else
        {
            System.out.println("تېخىچە ئۇخلىماپسىزغۇ!!");
        }
    }



    }
//        // سكانىر ئىقتىدارىنى قوشتۇق
//        Scanner waqit= new Scanner(System.in);
//        System.out.println(" ۋاقىتنى كىرگۈزۈڭ");
//        int saat= waqit.nextInt();

        // ئىف دېگەن شەرت جۈملىسىنى ئىشلەتتۇق


