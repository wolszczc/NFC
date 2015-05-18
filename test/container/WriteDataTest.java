/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author cezary
 */
public class WriteDataTest {

    public WriteDataTest() {
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
     * Test of saveFileToBase method, of class WriteData.
     */
    @Test
    public void testSaveFileToBase() throws Exception {
        System.out.println("saveFileToBase");
        String path = "Test/Base";
        File file = null;
        String words = "Hello";
        String fileName = "Test";
        WriteData.saveFileToBase(path, file, words, fileName);
        String expResult = Reader.readFile(path);
        assertEquals(expResult, words);

    }

    /**
     * Test of addFileToBase method, of class WriteData.
     */
    @Test
    public void testAddFileToBase() throws Exception {
        System.out.println("addFileToBase");
        String path = "Test/Base";
        File file = null;
        String words = "Hello";
        String fileName = "Test";
        WriteData.addFileToBase(path, file, words, fileName);
        words = words + "Hello";
        String expResult = Reader.readFile(path);
        assertEquals(expResult, words);
    }

    /**
     * Test of addTextToBase method, of class WriteData.
     */
    @Test
    public void testAddTextToBase() {
        System.out.println("addTextToBase");
        String path = "Test/Base";
        File file = null;
        String words = "Hello";
        String fileName = "Test";
        WriteData.addTextToBase(path, file, fileName, words);
        words = words + "Hello";
        String expResult = Reader.readFile(path);
        assertEquals(expResult, words);
    }

}
