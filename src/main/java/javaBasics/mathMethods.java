package javaBasics;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class mathMethods {
    public static void main(String[] args) {

        int x=435;
        int y=59;
        double z=57;
        int i=-57;
        System.out.println(String.format("ئىككى پۈتۈن ساننىڭ چوڭى %d دۇر. ", Math.max(x,y)));
        System.out.println(String.format("ئىككى پۈتۈن ساننىڭ كىچىكى %d دۇر. ", Math.min(x,y)));
        System.out.println(String.format("بۇ ساننىڭ يىلتىزى %.5f دۇر. ", Math.sqrt(z)));
        System.out.println(String.format("بۇ ساننىڭ مۇتلەق قىممىتى %d دۇر. ", Math.abs(i)));
        System.out.println(String.format("سىستېما خالىغانچە چىقىرىپ بەرگەن سان %f دۇر. ", Math.random()));
    }


}
