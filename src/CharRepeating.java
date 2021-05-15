
/*
Author : Osama Fouad
Data : 15 / May / 2021
for :  Assignment for DDMS lab 3
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class CharRepeating {

    private final char lookFor;
    private final FileReader file01;

    CharRepeating(FileReader file, char lookFor) {
        this.file01 = file;
        this.lookFor = lookFor;

    }

    private String readFile() throws IOException {

        String everything;

        try (BufferedReader br = new BufferedReader(file01)) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            everything = sb.toString();
        }
        return everything;
    }

    private int count(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == lookFor) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        String workDirec = System.getProperty("user.dir");


        FileReader file01 = new FileReader(workDirec + "\\hello.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The char wanna search for in hello.txt");
        System.out.println("Note : More than one char , automatic will take the first one   :) ");
        char c = sc.next().charAt(0);
        System.out.printf("The num of %c in hello.txt is \n", c);
        CharRepeating cl1 = new CharRepeating(file01, c);

        System.out.println(cl1.count(cl1.readFile()));
    }

}