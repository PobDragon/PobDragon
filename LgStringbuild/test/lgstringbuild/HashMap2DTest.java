/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lgstringbuild;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author djm
 */
public class HashMap2DTest {

    public HashMap2DTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addElement method, of class HashMap2D.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        String key1 = "A1";
        String key2 = "B2";
        String value = "C3";
        HashMap2D instance = new HashMap2D();
        instance.addElement(key1, key2, value);
    }

    /**
     * Test of getElement method, of class HashMap2D.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String value = "C3";
        HashMap2D instance = new HashMap2D();
        instance.addElement(key1, key2, value);

        System.out.println("RecoverElement");
        String expResult = "C3";
        String result = instance.getElement(key1, key2);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElement method, of class HashMap2D.
     */
    @Test
    public void testGetElementWrongKey() {
        System.out.println("getElement");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String value = "C3";
        HashMap2D instance = new HashMap2D();
        instance.addElement(key1, key2, value);

        System.out.println("RecoverElement");
        String expResult = null;
        String result = instance.getElement(key2, key1);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElement method, of class HashMap2D.
     */
    @Test
    public void testGetElementWrongKey2() {
        System.out.println("getElement");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String value = "C3";
        HashMap2D instance = new HashMap2D();
        instance.addElement(key1, key2, value);

        System.out.println("RecoverElement");
        String expResult = null;
        String result = instance.getElement(key1, value);
        assertEquals(expResult, result);
    }

}