/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import container.Container;

/**
 *
 * @author cezary
 */
public class testContainer {

    public static void main(String[] args) {
        Container[] con = new Container[10];
        Container[] con2 = new Container[10];
        for (int i = 0; i < 10; i++) {
            con[i] = new Container();
            con[i].setIndex(i);
            System.out.println(con);
        }
        con2 = con.clone();
        con = new Container[20];
        System.out.println(con);
        System.out.println(con2);

        System.arraycopy(con2, 0, con, 0, 10);
        for (int i = 10; i < 20; i++) {
            con[i] = new Container();
            con[i].setIndex(i);
            System.out.println(con);
        }
        
    }
}
