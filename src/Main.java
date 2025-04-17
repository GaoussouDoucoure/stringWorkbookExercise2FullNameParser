// FULL NAME PARSER EXERCISE IN THE WORKBOOK WEEK 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = sc.nextLine();
        firstName = firstName.trim();
        System.out.print("Please enter your middle name, if no middle name then enter this (none): ");
        String middleName = sc.nextLine();
        middleName = middleName.trim();
        System.out.print("Please enter your last name: ");
        String lastName = sc.nextLine();
        lastName = lastName.trim();

        String fullName = firstName + (middleName.equals("(none)") ? "" : " " + middleName) + " " + lastName ;
        fullName = fullName.trim();

        System.out.println(fullName);
    }
}