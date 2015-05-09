/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author wolszczc
 */
public class Reader {

    public static String createNewBase(String path) {
        StringBuilder sb = new StringBuilder();
        String words;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            while ((words = br.readLine()) != null) {
                sb.append(words);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


}
