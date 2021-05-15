
/*
Author : Osama Fouad
Data : 15 / May / 2021
for :  Assignment for DDMS lab 3
*/

import java.util.Scanner;

public class NameInitials {


    static void printInitials(String name) {
        if (name.length() == 0)
            return;

        System.out.print(Character.toUpperCase(
                name.charAt(0)));

        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                        name.charAt(i + 1)));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Name: ");
        String name = sc.nextLine().toString();
        printInitials(name);
    }
}

