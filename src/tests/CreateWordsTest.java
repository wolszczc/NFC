/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import container.Container;
import java.io.File;
import static container.Reader.*;

/**
 *
 * @author cezary
 */
public class CreateWordsTest {
    
    public static void main(String[] agrc){
        Container con1 = new Container();
        Container[] con = null;
        String nameFile = "base/Base";
        File file = new File(nameFile);
        createWords(con, nameFile);
    }

}