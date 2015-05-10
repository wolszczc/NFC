/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author wolszczc
 */
public class Container {
    
    private String word; /*przeczytane słowo*/
    private int index; /*numer słowa*/
    private int counts; /* zliczenia wybranego słowa w tekście*/
   
    public void setWord(String word){
        word = this.word;
    }
    
    public void setIndex(int index){
        index = this.index;
    }
    
    public void setCounts(int counts){
        counts = this.counts;
    }
    
    public String getWord(){
        return word;
    }
    
    public int getIndex(){
        return index;
    }
    
    public int getCounts(){
        return counts;
    }
}

