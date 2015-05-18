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
import java.util.TreeSet;
import static generator.Tree.addNGramToTree;

/**
 *
 * @author cezary
 */
public class CreateWordsTest {

    public static void main(String[] agrc) {
        int i = 0;
        TreeSet tree = null;
        Container[] con1 = new Container[10];
        Container[] con = null;
        int[] a = new int[1];
        NGramContainer[] n_gram = null;
        String nameFile = "base/Base";
        File file = new File(nameFile);
        con = createWordsArray(con, nameFile, a);

        n_gram = createNGram(n_gram, con, 2);

        tree = addNGramToTree(tree, n_gram, 2);
        System.out.println(tree);
        while (n_gram[i].getSufiks() != null) {
            System.out.println(n_gram[i].getPrefiksCounts());
            i++;
        }
    }

}
