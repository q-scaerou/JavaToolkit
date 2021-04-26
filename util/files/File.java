package util;

import java.io.FileInputStream;
import java.util.Scanner;

public class File {

    public static void read(String fileName) {
        try {
            FileInputStream fs = new FileInputStream(fileName);
            Scanner scn = new Scanner(fs);
            while (scn.hasNextLine()) {
                System.out.println(scn.nextLine());
            }
            scn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

