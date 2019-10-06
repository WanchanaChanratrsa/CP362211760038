package lab7;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;

        do {
            System.out.println("Enter an intteger: ");
            x = scanner.nextInt();
        }while (x !=0);

        System.out.println("Goog Bye.");
    }
}
