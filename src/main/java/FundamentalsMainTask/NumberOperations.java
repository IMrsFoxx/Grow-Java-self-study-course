package FundamentalsMainTask;

import java.util.Scanner;

public class NumberOperations {
    public static String SumAndProductOfNumber(int a, int b){
        return a+b + " " + a*b;
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        System.out.println ("Please, inter you number: ");
        int a = scr.nextInt ();
        int b = scr.nextInt ();
        System.out.println (SumAndProductOfNumber (a,b));
    }
}
