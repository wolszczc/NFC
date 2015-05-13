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
    
    public Container(){
        this(null,0,0);
    }
    
    public Container(String s, int i, int c){
        word = s;
        index = i;
        counts = c;
    }
   
    public void setWord(String word){
        this.word = word;
    }
    
    public void setIndex(int index){
        this.index = index;
    }
    
    public void setCounts(int counts){
        this.counts = counts;
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

