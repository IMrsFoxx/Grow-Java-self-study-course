package FundamentalsMainTask;

import java.util.Random;

public class RandomNumber {
    public static void NumberWithTransitionAndWithoutOnNewLine(){

        int[] count = new int[5];
        for (int i = 0; i <count.length ; i++) {
            count[i] = getRandomNumber (1,10);
        }
        System.out.println (count[0] );
        System.out.print(count[1] +" "+ count[2] + " ");
        System.out.println (count[3]);
        System.out.println (count[4]);

    }
    public static int getRandomNumber(int max,int min){
        Random rnd = new Random ();
        return (int)(Math.random()*((max-min)+1))+min;
    }

    public static void main(String[] args) {
        NumberWithTransitionAndWithoutOnNewLine ();
    }
}
