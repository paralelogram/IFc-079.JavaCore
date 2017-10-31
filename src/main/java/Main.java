// created by
// group IFc-079.JavaCore
// student Andrii Sabii

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius, perimeter, area;

        Scanner s = new Scanner(System.in);

        System.out.print("input radius of the bad : ");

        radius = s.nextDouble();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("perimeter of the bad = " + perimeter);
        System.out.println("area of the bad = " + area);
    }
}
