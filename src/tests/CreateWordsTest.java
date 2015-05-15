/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import container.Container;
import static container.Container.createWordsArray;
import java.io.File;
import generator.NGramContainer;
import static generator.TextGenerator.createNGram;

/**
 *
 * @author cezary
 */
public class CreateWordsTest {

    public static void main(String[] agrc) {
        Container[] con1 = new Container[10];
        Container[] con = null;
        int[] a = new int[1];
        NGramContainer[] n_gram = null;
        String nameFile = "base/Base";
        File file = new File(nameFile);
        con = createWordsArray(con, nameFile, a);
        
        n_gram = createNGram(n_gram, con, 10);

       System.out.println(n_gram[10].getPrefiks()[2]);
        System.out.println(con.length);
    }

}
