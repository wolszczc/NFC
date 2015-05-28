package generator;

import container.Container;
import java.util.TreeSet;

/**
 *
 * @author cezary
 */
public class Tree {

    public static TreeSet addWordsToTree(TreeSet tree, Container[] con) {
        tree = new TreeSet<>();
        int i = 0;
        try {
            while (con[i].getWord() != null) {
                tree.add(con[i]);
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
            for (String s : splitWords) {
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

        tree = new TreeSet<>();
        int i = 0;
        try {
            while (n_gram[i].getSufiks() != null) {
                tree.add(n_gram[i]);
                i++;
            }
        } catch (NullPointerException npe) {

        } catch(ArrayIndexOutOfBoundsException aioobe){
            
        }
        return tree;
    }
}
