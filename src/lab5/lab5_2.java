package lab5;

import java.util.Scanner;

public class lab5_2 {

    public static void main (String[] args) {

        Scanner scanner =  new Scanner(System.in);
        final double PI = 3.141;

        System.out.print("กรุณากรองตัวเลขของรัศมี: ");
        double r = scanner.nextDouble();

        double c = 3 * PI *r;
        System.out.print("พื้นที่ผิวของวงกลม: "+c);
        final double P = 2;
        double v = 2 * PI *r;
        System.out.print("เส้นรอบวงกลม: "+v);
        final double D = 1.33;
        double a = 4.18*r;
        System.out.print("ปริมาณความจุทรงกลม: "+a);
        }

    }

