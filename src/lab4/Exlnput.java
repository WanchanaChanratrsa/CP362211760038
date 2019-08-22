package lab4;

import java.util.Scanner;

public class Exlnput {

    public static void main (String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.print("Please,entered an integer:");
         int x = scanner.nextInt();

         System.out.println ("Your entered integer: "+x);

         //input double
        System.out.print("Please,enter double: ");
        double y = scanner.nextInt();

        System.out.println ("Your entered double: "+y);

        //input String
        System.out.println("Please,enter you name");
        String s = scanner.nextLine();

        System.out.println("You name is:"+s);

    }
}
