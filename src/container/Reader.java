/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author wolszczc
 */
public class Reader {

    public static String createNewBase(String fileName) {
        StringBuilder sb = new StringBuilder();
        String words;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((words = br.readLine()) != null) {
                sb.append(words);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void createWords(Container[] con, String nameFile) {
        int tabSize = 10;
        int a = 0;
        int i = 0;
        con = new Container[tabSize];
        String dane;
        File file = new File(nameFile);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException fnfe) {
            System.err.println("File: " + file + " is not exist");
        }

        try {
            while ((dane = scanner.next()) != null) {
                /*to miejsce do poprawy*/
                if (tabSize < i) {
                    tabSize *= 2;
                    System.arraycopy(con, 0, con, 0, tabSize);
                }
                con[i].setWord(dane);
                con[i].setCounts(dane.length());
                con[i].setIndex(i);
                i++;
                /*to miejsce do poprawy*/

                System.out.println(dane);
            }
        } catch (NullPointerException npe) {
            System.err.println("File: " + file + " = null pointer");
        } catch (NoSuchElementException nsee) {

        }
    }

}
