package FundamentalsMainTask;

import java.util.Scanner;

public class ReverseString {
    public static void ArgumentFromCommandReverse(){
        Scanner scr= new Scanner (System.in);
        System.out.println ("Please, inter you argument: ");
        String arguments = scr.nextLine ();
        System.out.println (new StringBuffer (arguments).reverse());
    }
    public static void main(String[] args) {
        ArgumentFromCommandReverse ();
    }
}
