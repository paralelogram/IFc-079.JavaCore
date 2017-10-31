// created by
// group IFc-079.JavaCore
// student Andrii Sabii

import java.util.Scanner;

public class Question {

    public static void main(String [] args) {
        String name, address;

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("Where are you live, " + name + " ?");
        address = scanner.nextLine();

        System.out.println("The army will visit you, " + name + " at the address - " + address + " to present the summons.");
        System.out.println("Please, don't run away!");
    }
}
