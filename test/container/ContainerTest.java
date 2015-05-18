/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cezary
 */
public class ContainerTest {
    
    public ContainerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setWord method, of class Container.
     */
    @Test
    public void testSetWord() {
        System.out.println("setWord");
        String word = "";
        Container instance = new Container();
        instance.setWord(word);
    }

    /**
     * Test of setIndex method, of class Container.
     */
    @Test
    public void testSetIndex() {
        System.out.println("setIndex");
        int index = 0;
        Container instance = new Container();
        instance.setIndex(index);
    }

    /**
     * Test of setCounts method, of class Container.
     */
    @Test
    public void testSetCounts() {
        System.out.println("setCounts");
        int counts = 0;
        Container instance = new Container();
        instance.setCounts(counts);
    }

    /**
     * Test of getWord method, of class Container.
     */
    @Test
    public void testGetWord() {
        System.out.println("getWord");
        Container instance = new Container();
        String expResult = null;
        String result = instance.getWord();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIndex method, of class Container.
     */
    @Test
    public void testGetIndex() {
        System.out.println("getIndex");
        Container instance = new Container();
        int expResult = 0;
        int result = instance.getIndex();
        assertEquals(expResult, result);;
    }

    /**
     * Test of getCounts method, of class Container.
     */
    @Test
    public void testGetCounts() {
        System.out.println("getCounts");
        Container instance = new Container();
        int expResult = 0;
        int result = instance.getCounts();
        assertEquals(expResult, result);

    }

    /**
     * Test of createWordsArray method, of class Container.
     */
    @Test
    public void testCreateWordsArray() {
        System.out.println("createWordsArray");
        Container[] con = new Container[10000];
        String nameFile = "base/Base";
        int[] arrayLength = new int[10];
        Container[] expResult = new Container[10000];
        expResult = Container.createWordsArray(expResult, nameFile, arrayLength);
        Container[] result = Container.createWordsArray(con, nameFile, arrayLength);
        assertArrayEquals(expResult, result);
        
    }
    
}
