package Midterm;

import java.util.Scanner;

public class Midterm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender;
        double h;
        int k,age;
        //input data
        System.out.println("Enter gender:");
        gender = sc.next().charAt(0);
        System.out.println("Enter high:");
        h = sc.nextDouble();
        System.out.println("Enter kilogram");
        k = sc.nextInt();
        System.out.println("Enter age");
        age = sc.nextInt();
        double p_m = 66.5+(13.75*k)+(5.003*h)-(6.775*age);
        System.out.println(p_m);
    }
}
