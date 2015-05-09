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

/**
 *
 * @author wolszczc
 */
public class Reader {

    public static void createNewBase(String fileName, File file) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String tmp;
            bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((tmp = bufferedReader.readLine()) != null) {
                stringBuilder.append(tmp);
            }
        } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (bufferedReader != null)
	            	bufferedReader.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

    }



//    public static void addToBase(File file) throws FileNotFoundException {
//        PrintWriter save = new PrintWriter("Base.txt");
//        BufferedWriter bufferWriter = new BufferedWriter(save);
//
//        save.println(file);
//        save.close();
//    }
}
