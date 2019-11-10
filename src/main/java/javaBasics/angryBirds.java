package javaBasics;

import java.util.Scanner;

/** * قاغىنىڭ مۇساپىسىنى ۋە قۇشنىڭ ئۇچۇش بۇلۇڭىنى كىرگۈزسەك ...
 * قۇشنىڭ ئېتىلىش كۈچىنى چىقىرىپ بېرىدۇ.
 */
public class angryBirds {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" مۇساپىنى كىرىگۈزۈڭ ");
        int kirguzgenMusape= scan.nextInt();

        System.out.println("ئېتىلىشى بۇلۇڭىنى كىرگۈزۈڭ ");
        int kirgvzgenBulung= scan.nextInt();
        System.out.println(String.format("كېرەكلىك ئېتىلىشى كۈچى %d",kuchniTepish(kirguzgenMusape,kirgvzgenBulung)));
        System.out.println(String.format("ئەگەر بۇ سېرىق قۇشقاچ بولسا ئېتىلىش كۈچى %d بولىدۇ.",seqriqQushqachningKuchi(kirguzgenMusape,kirgvzgenBulung)));
    }

    private static int kuchniTepish(int musape, int bulung)
    {
        return (musape * bulung) /2;
    }

    private static int seqriqQushqachningKuchi(int musape, int bulung)
    {
        return (musape*bulung)/3;
    }
}
