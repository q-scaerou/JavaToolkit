/*
This program will print some words depending on 2 criteria.
First call the program and the text: $ java Cat /etc/dictionaries-common/words 
Then chose between 'ego', 'inf' (<) or 'sup' (>)
Last chose the number of letters.
e.g: * $ java Cat /etc/dictionaries-common/words ego 5    -> only the 5-letter words will be shown in the console
     * $ java Cat /etc/dictionaries-common/words sup 3    -> only the words with 4+ letters will be shown in the console
     * $ java Cat /etc/dictionaries-common/words inf 7    -> only the words with 6 letters maximum will be shown in the console
Have fun! :)
*/

import java.io.FileInputStream;
import java.util.Scanner;

public class NCat {

    public static void main(String[] args) {
        if (args.length != 0) {
            String fileName = args[0];
            String filter = args[1];
            String maxLength = args[2];
            int length = Integer.valueOf(maxLength);
            if (filter.equals("ego")) {
                try {
                    FileInputStream fs = new FileInputStream(fileName);
                    Scanner scn = new Scanner(fs);
                    while (scn.hasNextLine()) {
                        String line = scn.nextLine();
                        if (line.length() == length) {
                            System.out.println(line);
                        }
                    }
                    scn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (filter.equals("inf")) {
                try {
                    FileInputStream fs = new FileInputStream(fileName);
                    Scanner scn = new Scanner(fs);
                    while (scn.hasNextLine()) {
                        String line = scn.nextLine();
                        if (line.length() < length) {
                            System.out.println(line);
                        }
                    }
                    scn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (filter.equals("sup")) {
                try {
                    FileInputStream fs = new FileInputStream(fileName);
                    Scanner scn = new Scanner(fs);
                    while (scn.hasNextLine()) {
                        String line = scn.nextLine();
                        if (line.length() > length) {
                            System.out.println(line);
                        }
                    }
                    scn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}