/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import container.Container;

/**
 *
 * @author cezary
 */
public class TextGenerator {
        public static NGramContainer[] createNGram(NGramContainer[] n_gram, Container[] con, int rankOfN_gram) {/*tworzy n_gram*/
        int tabSize = 10;
        int i = 0;
        n_gram = new NGramContainer[tabSize];
        try {
            while (con[i + rankOfN_gram].getWord() != null) {
                if (tabSize <= i) {
                    NGramContainer[] n_gram2 = new NGramContainer[tabSize];
                    n_gram2 = n_gram.clone();
                    tabSize *= 2;
                    n_gram = new NGramContainer[tabSize];
                    System.arraycopy(n_gram2, 0, n_gram, 0, tabSize / 2);
                }
                n_gram[i] = new NGramContainer(rankOfN_gram);
                for (int j = 0; j < rankOfN_gram; j++) {
                    n_gram[i].setPrefiks(con[i + j].getWord(), j);
                }
                n_gram[i].setSufiks(con[i + rankOfN_gram].getWord());
                n_gram[i].setIndex(i);
                System.out.println(n_gram[i].getSufiks());
                i++;

            }
        } catch (NullPointerException npe) {
            /*czyta o jeden za dużo stąd ten null*/
        }

        return n_gram;
    }
}
