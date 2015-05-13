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

    public static String readFile(String fileName) { /*czyta z pliku*/
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

    public static Container[] createWordsArray(Container[] con, String nameFile) {
        int tabSize = 10;
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
                if (tabSize <= i) {
                    Container[] con2 = new Container[tabSize];
                    con2 = con.clone();
                    tabSize *= 2;
                    con = new Container[tabSize];
                    System.arraycopy(con2, 0, con, 0, tabSize / 2);
                }
                con[i] = new Container();
                con[i].setWord(dane);
                con[i].setIndex(1);
                i++;

//                System.out.println(con[i - 1].getWord() + "  " + con[i - 1].getCounts());
            }
        } catch (NullPointerException npe) {
            System.err.println("Error: file: " + file + " = null pointer");
        } catch (NoSuchElementException nsee) {

        }
        return con;
        
    }

}
