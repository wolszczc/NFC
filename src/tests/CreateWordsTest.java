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
import generator.StatsGenerator;
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
        StatsGenerator stats = new StatsGenerator();
        int[] a = new int[1];
        NGramContainer[] n_gram = null;
        String nameFile = "base/Base";
        File file = new File(nameFile);
        con = createWordsArray(con, nameFile, a);

        n_gram = createNGram(n_gram, con, 2);
        
        tree = addNGramToTree(tree, n_gram, 2);
//        stats.findMostCommonNGrams(n_gram);
        
//        for(int t = 0;t<=4; t++){
//            System.out.println(stats.getPointer()[t]);
//        }
        
//        System.out.println(tree);
        try {
            while ((n_gram[i].getSufiks() != null) && (n_gram[i].getPrefiksCounts()>1)) {
                System.out.println(n_gram[i].getPrefiks() + " " + n_gram[i].getSufiksCounts());
//                System.out.println(Arrays.toString(n_gram[i].getPointerOnSufiks()));
                i++;
            }
        } catch (NullPointerException npe) {

        }
    }

}
