package generator;

import container.Container;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author cezary
 */
public class Tree {

    public static TreeSet addWordsToTree(TreeSet tree, Container[] con) {
        tree = new TreeSet();
        int i = 0;
        try {
            while (con[i].getWord() != null) {
                tree.add(con[i].getWord());
                i++;
            }
        } catch (NullPointerException npe) {

        }
        return tree;
    }

    public static String checkWordsInDictionary(TreeSet tree, String wordsIn) {
        String[] splitWords;
        String newWords = "";
        int i = 0;
        splitWords = wordsIn.split(" ");
        try {
            for(String s: splitWords) {
                if (!tree.contains(s)) {
                    newWords = newWords + "\n" + s;
                }
                i++;
            }
        } catch (NullPointerException npe) {

        }
        return newWords;
    }

        public static TreeSet addNGramToTree(TreeSet tree, NGramContainer[] n_gram, int rankOfN_gram) {/*dodaje ngram do drzewa*/

        tree = new TreeSet(new Cmp());
        int i = 0;
        try {
            while (n_gram[i].getSufiks() != null) {
                tree.add(n_gram[i]);
//                if (tree.contains(n_gram[i].getSufiks())) {
//                    int counts = n_gram[i].getPrefiksCounts();
//                    counts++;
//                    n_gram[i].setPrefiksCounts(counts);
//
//                }
                i++;
            }
        } catch (NullPointerException npe) {

        }

        return tree;
    }
}

class Cmp implements Comparator<NGramContainer> {

    @Override
    public int compare(NGramContainer n_gram1, NGramContainer n_gram2) {
        if (Arrays.equals(n_gram1.getPrefiks(), n_gram2.getPrefiks()) == true) {
            int countsPrefiks = n_gram1.getPrefiksCounts();
            countsPrefiks++;
            n_gram1.setPrefiksCounts(countsPrefiks);
            n_gram2.setPrefiksCounts(countsPrefiks);
            if (n_gram1.getSufiks().equals(n_gram2.getSufiks())) {
                int countsSufiks = n_gram1.getSufiksCounts();
                countsSufiks++;
                n_gram1.setSufiksCounts(countsSufiks);
                n_gram2.setSufiksCounts(countsSufiks);
            }
            return 1;
        } else {
            return -1;
        }
    }

}
