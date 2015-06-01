/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import monitor.Window;

/**
 *
 * @author wolszczc
 */
public class StatsGenerator {

    private int[] pointer;
    int[] pointerToNGram;
    private int[] pointerSufiks;
    int[] pointerToSufiks;

    public StatsGenerator() {
        pointer = new int[5];
        pointerToNGram = new int[5];
        pointerSufiks = new int[5];
        pointerToSufiks = new int[5];
    }

    public int[] getPointerSufiks() {
        return pointerSufiks;
    }

    public void setPointerSufiks(int[] pointerSufiks) {
        this.pointerSufiks = pointerSufiks;
    }

    public int[] getPointer() {
        return pointer;
    }

    public void setPointer(int[] pointer) {
        this.pointer = pointer;
    }

    public static void createProbabilityOfPrefiks(NGramContainer n_gram, int lengthOfArray) {
        try {
            double probability = (double) n_gram.getPrefiksCounts() / (double) lengthOfArray;
            n_gram.setProbabilityOfPrefiks(probability);
        } catch (NullPointerException npe) {

        }
    }

    public static void createProbabilityOfSufiks(NGramContainer n_gram) {
        try {
            double probability = (double) n_gram.getSufiksCounts() / (double) n_gram.getPrefiksCounts();
            n_gram.setProbabilityOfSufiks(probability);
        } catch (NullPointerException npe) {

        }
    }

    public static void createProbabilityOfNGram(NGramContainer n_gram, int lengthOfArray) {
        try {
            double probability = (n_gram.getPrefiksCounts() / lengthOfArray) * (n_gram.getSufiksCounts() / n_gram.getPrefiksCounts());
            n_gram.setProbabilityOfN_gram(probability);
        } catch (NullPointerException npe) {

        }
    }

    public void findMostCommonNGrams(NGramContainer[] n_gram) {
        int tmp;
        String[] tmpString = new String[4];
        int i = 0;
        int j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[0] < tmp) {
                    pointer[0] = tmp;
                    pointerToNGram[0] = n_gram[j].getIndex();
                }
                j++;
            }

        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[0] = n_gram[pointerToNGram[0]].getPrefiks();
            tmpString[0] = n_gram[pointerToNGram[0]].getPrefiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[1] <= tmp && tmpString[0].equals(n_gram[j].getPrefiks()) == false) {
                    pointer[1] = tmp;
                    pointerToNGram[1] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[1] = n_gram[pointerToNGram[1]].getPrefiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[2] <= tmp
                        && tmpString[0].equals(n_gram[j].getPrefiks()) == false
                        && tmpString[1].equals(n_gram[j].getPrefiks()) == false) {
                    pointer[2] = tmp;
                    pointerToNGram[2] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[2] = n_gram[pointerToNGram[2]].getPrefiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[3] <= tmp
                        && tmpString[0].equals(n_gram[j].getPrefiks()) == false
                        && tmpString[1].equals(n_gram[j].getPrefiks()) == false
                        && tmpString[2].equals(n_gram[j].getPrefiks()) == false) {
                    pointer[3] = tmp;
                    pointerToNGram[3] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[3] = n_gram[pointerToNGram[3]].getPrefiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getPrefiksCounts();
                if (pointer[4] <= tmp
                        && tmpString[0].equals(n_gram[j].getPrefiks()) == false
                        && tmpString[1].equals(n_gram[j].getPrefiks()) == false
                        && tmpString[2].equals(n_gram[j].getPrefiks()) == false
                        && tmpString[3].equals(n_gram[j].getPrefiks()) == false) {
                    pointer[4] = tmp;
                    pointerToNGram[4] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
    }

    public void findMostCommonSufiks(NGramContainer[] n_gram) {
        int tmp;
        String[] tmpString = new String[4];
        int i = 0;
        int j = 0;
        try {
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[0] < tmp) {
                    pointerSufiks[0] = tmp;
                    pointerToSufiks[0] = n_gram[j].getIndex();
                }
                j++;
            }

        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[0] = n_gram[pointerToSufiks[0]].getSufiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[1] <= tmp && tmpString[0].equals(n_gram[j].getSufiks()) == false) {
                    pointerSufiks[1] = tmp;
                    pointerToSufiks[1] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[1] = n_gram[pointerToSufiks[1]].getSufiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[2] <= tmp
                        && tmpString[0].equals(n_gram[j].getSufiks()) == false
                        && tmpString[1].equals(n_gram[j].getSufiks()) == false) {
                    pointerSufiks[2] = tmp;
                    pointerToSufiks[2] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[2] = n_gram[pointerToSufiks[2]].getSufiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[3] <= tmp
                        && tmpString[0].equals(n_gram[j].getSufiks()) == false
                        && tmpString[1].equals(n_gram[j].getSufiks()) == false
                        && tmpString[2].equals(n_gram[j].getSufiks()) == false) {
                    pointerSufiks[3] = tmp;
                    pointerToSufiks[3] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
        j = 0;
        try {
            tmpString[3] = n_gram[pointerToSufiks[3]].getSufiks();
            while (n_gram[j].getPrefiks() != null) {
                tmp = n_gram[j].getSufiksCounts();
                if (pointerSufiks[4] <= tmp
                        && tmpString[0].equals(n_gram[j].getSufiks()) == false
                        && tmpString[1].equals(n_gram[j].getSufiks()) == false
                        && tmpString[2].equals(n_gram[j].getSufiks()) == false
                        && tmpString[3].equals(n_gram[j].getSufiks()) == false) {
                    pointerSufiks[4] = tmp;
                    pointerToSufiks[4] = n_gram[j].getIndex();
                }
                j++;
            }
        } catch (NullPointerException npe) {

        } catch (ArrayIndexOutOfBoundsException aioobe) {

        }
    }

    public String createStatsArray(NGramContainer[] n_gram) {
        String words = "";
        createProbabilityOfPrefiks(n_gram[pointerToNGram[0]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[1]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[2]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[3]], Window.getArrayLength()[0]);
        createProbabilityOfPrefiks(n_gram[pointerToNGram[4]], Window.getArrayLength()[0]);

        try {
            words = "1  " + n_gram[pointerToNGram[0]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[0]].getProbabilityOfPrefiks()) + "\n2  "
                    + n_gram[pointerToNGram[1]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[1]].getProbabilityOfPrefiks()) + "\n3  "
                    + n_gram[pointerToNGram[2]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[2]].getProbabilityOfPrefiks()) + "\n4  "
                    + n_gram[pointerToNGram[3]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[3]].getProbabilityOfPrefiks()) + "\n5  "
                    + n_gram[pointerToNGram[4]].getPrefiks() + "     " + String.format("%.10f", n_gram[pointerToNGram[4]].getProbabilityOfPrefiks());
        } catch (NullPointerException npe) {

        }
        return words;
    }

    public String createStatsArray2(NGramContainer[] n_gram) {
        String words = "";
        createProbabilityOfSufiks(n_gram[pointerToSufiks[0]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[1]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[2]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[3]]);
        createProbabilityOfSufiks(n_gram[pointerToSufiks[4]]);

        try {
            words = "1  " + n_gram[pointerToSufiks[0]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[0]].getProbabilityOfSufiks()) + "\n2  "
                    + n_gram[pointerToSufiks[1]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[1]].getProbabilityOfSufiks()) + "\n3  "
                    + n_gram[pointerToSufiks[2]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[2]].getProbabilityOfSufiks()) + "\n4  "
                    + n_gram[pointerToSufiks[3]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[3]].getProbabilityOfSufiks()) + "\n5  "
                    + n_gram[pointerToSufiks[4]].getSufiks() + "     " + String.format("%.5f", n_gram[pointerToSufiks[4]].getProbabilityOfSufiks());
        } catch (NullPointerException npe) {

        }
        return words;
    }

}
