/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import org.omg.CORBA.INTERNAL;

/**
 *
 * @author wolszczc
 */
public class StatsGenerator {

    private int[] pointer;

    public StatsGenerator() {
        pointer = new int[5];
    }

    public int[] getPointer() {
        return pointer;
    }

    public void setPointer(int[] pointer) {
        this.pointer = pointer;
    }

    public static void createProbabilityOfPrefiks(NGramContainer n_gram, int lengthOfArray) {
        double probability = n_gram.getPrefiksCounts() / lengthOfArray;
        n_gram.setProbabilityOfPrefiks(probability);
    }

    public static void createProbabilityOfSufiks(NGramContainer n_gram) {
        double probability = n_gram.getSufiksCounts() / n_gram.getPrefiksCounts();
        n_gram.setProbabilityOfSufiks(probability);
    }

    public static void createProbabilityOfNGram(NGramContainer n_gram, int lengthOfArray) {
        double probability = (n_gram.getPrefiksCounts() / lengthOfArray) * (n_gram.getSufiksCounts() / n_gram.getPrefiksCounts());
        n_gram.setProbabilityOfN_gram(probability);
    }

    public void findMostCommonNGrams(NGramContainer[] n_gram) {
        int tmp = 0;
        int i = 0;
        try {
            while (n_gram[i].getPrefiks() != null) {
                if (n_gram[i].getPrefiksCounts() >= tmp && i > 4) {
                    tmp = n_gram[i].getPrefiksCounts();
                    pointer[0] = pointer[1];
                    pointer[1] = pointer[2];
                    pointer[2] = pointer[3];
                    pointer[3] = pointer[4];
                    pointer[4] = tmp;
                                     
                }
                i++;
            }
        } catch (NullPointerException npe) {

        }
    }

}
