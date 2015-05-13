/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import container.Container;
import java.io.File;
import static container.Reader.*;
import generator.NGramContainer;
import static generator.TextGenerator.createN_gram;

/**
 *
 * @author cezary
 */
public class CreateWordsTest {

    public static void main(String[] agrc) {
        Container[] con1 = new Container[10];
        Container[] con = null;
        NGramContainer[] n_gram = null;
        String nameFile = "base/Base";
        File file = new File(nameFile);
        con = createWordsArray(con, nameFile);
        
        n_gram = createN_gram(n_gram, con, 10);

       System.out.println(n_gram[10].getPrefiks()[2]);
        System.out.println(con.length);
    }

}
