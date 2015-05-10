/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author wolszczc
 */
public class WriteData {

    public static void saveFileToBase(String fileName, File file, String words) throws IOException {
        try {

            file = new File(fileName);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(words);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addTextToFile(String path, File file, String words) throws IOException {
        try {
            file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file, true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(words);
            bufferWritter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
