package Midterm;

import java.util.Scanner;

public class Midterm2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double Pi = 3.141;
        System.out.println("กรุณาตัวเลขรัศมี:");
        double r = scanner.nextDouble();
        double Area = Pi*r*r;
        System.out.println("พื่นที่ฐานของทรงกระบอก:"+ Area);
        double h = 2*Pi*r;
        System.out.println("ความสูงของทรงกระบอก:"+ h);
        double v = (4/3)*Pi*r*r*r;
        System.out.println("ปริมาตรของทรงกระบอก"+ v);
    }
}
