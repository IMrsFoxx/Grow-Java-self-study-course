package FundamentalsMainTask;

import java.util.Scanner;

public class HelloPersonFromCommand {

    public static void HelloSomebody(){
        Scanner scr= new Scanner (System.in);
        System.out.println ("Please, inter you name: ");
        String Name = scr.nextLine ();
        System.out.println ("Hello, " + Name);
    }
    public static void main(String[] args) {

        HelloSomebody ();
    }
}
