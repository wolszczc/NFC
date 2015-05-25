/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

/**
 *
 * @author wolszczc
 */
public class StatsGenerator {
    
    public void createProbabilityOfPrefiks(NGramContainer n_gram, int lengthOfArray){
        double probability = n_gram.getPrefiksCounts()/lengthOfArray;
        /*do dopracowania*/
    }
}
