// created by
// group IFc-079.JavaCore
// student Andrii Sabii

import java.util.Scanner;

public class PhoneBills {

    public static void main(String[] args) {

        double c1, c2, c3;
        double t1, t2, t3;
        double bill1, bill2, bill3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How match does the call to Poland cost? (dollars) ");
        c1 = scanner.nextDouble();

        System.out.println("How match does the call to Great Britain cost? (dollars) ");
        c2 = scanner.nextDouble();

        System.out.println("How match does the call to the USA cost? (dollars) ");
        c3 = scanner.nextDouble();

        System.out.println("How long did the call to Poland last? (minutes) ");
        t1 = scanner.nextDouble();

        System.out.println("How long did the call to Great Britain last? (minutes) ");
        t2 = scanner.nextDouble();

        System.out.println("How long did the call to the USA last? (minutes) ");
        t3 = scanner.nextDouble();

        bill1 = c1 * t1;
        bill2 = c2 * t2;
        bill3 = c3 * t3;

        System.out.println(" your bill for calls to other countries - " + (bill1 + bill2 + bill3));
        System.out.println(" \t\t\t\t to Poland - " + bill1);
        System.out.println(" \t\t\t\t to Great Britain - " + bill2);
        System.out.println(" \t\t\t\t to the USA - " + bill3);
    }
}
