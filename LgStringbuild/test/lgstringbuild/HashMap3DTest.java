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
public class HashMap3DTest {

    public HashMap3DTest() {
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
     * Test of addElement3D method, of class HashMap3D.
     */
    @Test
    public void testAddElement3D() {
        System.out.println("addElement3D");
        String key1 = "A1";
        String key2 = "B2";
        String key3 = "C3";
        String value = "D4";
        HashMap3D instance = new HashMap3D();
        instance.addElement3D(key1, key2, key3, value);
    }

    /**
     * Test of getElement3D method, of class HashMap3D.
     */
    @Test
    public void testGetElement3D() {
        System.out.println("getElement3D");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String key3 = "C3";
        String value = "D4";
        HashMap3D instance = new HashMap3D();
        instance.addElement3D(key1, key2, key3, value);

        String expResult = "D4";
        String result = instance.getElement3D(key1, key2, key3);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElement3D method, of class HashMap3D.
     * this uses a wrong key to test the fail.
     */
    @Test
    public void testGetElement3DWrongKey1() {
        System.out.println("getElement3D");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String key3 = "C3";
        String value = "D4";
        HashMap3D instance = new HashMap3D();
        instance.addElement3D(key1, key2, key3, value);

        String wrongKey = "x9";

        String expResult = null;
        String result = instance.getElement3D(wrongKey, key2, key3);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElement3D method, of class HashMap3D.
     * this uses a wrong key to test the fail.
     */
    @Test
    public void testGetElement3DWrongKey2() {
        System.out.println("getElement3D");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String key3 = "C3";
        String value = "D4";
        HashMap3D instance = new HashMap3D();
        instance.addElement3D(key1, key2, key3, value);

        String wrongKey = "x9";

        String expResult = null;
        String result = instance.getElement3D(key1, wrongKey, key3);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElement3D method, of class HashMap3D.
     * this uses a wrong key to test the fail.
     */
    @Test
    public void testGetElement3DWrongKey3() {
        System.out.println("getElement3D");

        System.out.println("LoadTestElement");
        String key1 = "A1";
        String key2 = "B2";
        String key3 = "C3";
        String value = "D4";
        HashMap3D instance = new HashMap3D();
        instance.addElement3D(key1, key2, key3, value);

        String wrongKey = "x9";

        String expResult = null;
        String result = instance.getElement3D(key1, key2, wrongKey);
        assertEquals(expResult, result);
    }

    /**
     * Test of getElement3D method, of class HashMap3D.
     * this uses a wrong key to test the fail.
     */
    @Test
    public void testGetElement3D_DefaultLoad() {
        System.out.println("getElement3D");

        System.out.println("Testing the default loading characteristics");
        String key1 = "Test1";
        String key2 = "Test2";
        String key3 = "Test3";
        HashMap3D instance = new HashMap3D();

        String expResult = "QQQQQ";
        String result = instance.getElement3D(key1, key2, key3);
        assertEquals(expResult, result);
    }

}