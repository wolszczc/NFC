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
public class TextGenerator {
    private String[] prefiks;
    private String sufiks;
    private int index;
    private int prefiksCounts;
    private int sufiksCounts;
    
    public TextGenerator(){
        prefiks = new String[0];
        prefiks[0] = "";
        sufiks = "";
        index = 0;
        prefiksCounts = 0;
        sufiksCounts = 0;
    }
}
