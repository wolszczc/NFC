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
public class NGramContainer {

    private String[] prefiks; /*tablica prefiksów*/

    private String sufiks; /*sufiksy*/

    private int index; /*numer prefiksu*/

    private int prefiksCounts; /*zliczenia prefiksów*/

    private int sufiksCounts; /*zliczenia sufiksów*/
    
    private int[] pointerOnSufiks;  /*wskażnik na sufiks*/

    private double probabilityOfPrefiks; /*prawdopodobieństwo wystąpienia prefiksu*/

    private double probabilityOfSufiks; /*prawdopodobieństwo wystąpienia sufiksu*/

    private double probabilityOfN_gram; /*prawdopodobieństwo wystąpienia n_gramu*/


    public NGramContainer(int lengthPrefiksArray) {
        prefiks = new String[lengthPrefiksArray];
        sufiks = null;
        index = 0;
        prefiksCounts = 1;
        sufiksCounts = 1;
        pointerOnSufiks = null;
        probabilityOfPrefiks = 0;
        probabilityOfSufiks = 0;
        probabilityOfN_gram = 0;
    }

    public String[] getPrefiks() {
        return prefiks;
    }

    public void setPrefiks(String prefiks, int numberOfArray) {
        this.prefiks[numberOfArray] = prefiks;
    }

    public String getSufiks() {
        return sufiks;
    }

    public void setSufiks(String sufiks) {
        this.sufiks = sufiks;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPrefiksCounts() {
        return prefiksCounts;
    }

    public void setPrefiksCounts(int prefiksCounts) {
        this.prefiksCounts = prefiksCounts;
    }

    public int getSufiksCounts() {
        return sufiksCounts;
    }

    public void setSufiksCounts(int sufiksCounts) {
        this.sufiksCounts = sufiksCounts;
    }

    public double getProbabilityOfPrefiks() {
        return probabilityOfPrefiks;
    }

    public void setProbabilityOfPrefiks(double probabilityOfPrefiks) {
        this.probabilityOfPrefiks = probabilityOfPrefiks;
    }

    public double getProbabilityOfSufiks() {
        return probabilityOfSufiks;
    }

    public void setProbabilityOfSufiks(double probabilityOfSufiks) {
        this.probabilityOfSufiks = probabilityOfSufiks;
    }

    public double getProbabilityOfN_gram() {
        return probabilityOfN_gram;
    }

    public void setProbabilityOfN_gram(double probabilityOfN_gram) {
        this.probabilityOfN_gram = probabilityOfN_gram;
    }
    
    @Override
    public String toString(){
       return "" + prefiksCounts; 
    }

}
