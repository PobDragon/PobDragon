/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lgstringbuild;

import java.util.HashMap;

/**
 *
 * @author djm
 */
public class HashMap3D {

    private HashMap<String, HashMap> huskMap;
//    private HashMap<String, HashMap> outerMap;

    public HashMap3D() {
        huskMap = new HashMap<String, HashMap>();

        addElement3D("Test1", "Test2", "Test3", "QQQQQ");
    }

    public void addElement3D(String key1, String key2, String key3, String value) {
        HashMap outerMap = huskMap.get(key1);
        if (outerMap == null) {
            outerMap = new HashMap<String, String>();
            HashMap innerMap = new HashMap<String, HashMap>();
            innerMap.put(key3, value);
            outerMap.put(key2, innerMap);
            huskMap.put(key1, outerMap);
        } else {
            HashMap innerMap = (HashMap) outerMap.get(key2);
            if (innerMap == null) {
                innerMap = new HashMap<String, String>();
                outerMap.put(key2, innerMap);
            }
            innerMap.put(key3, value);
            outerMap.put(key2, innerMap);
            huskMap.put(key1, outerMap);
        }

    }

    public String getElement3D(String key1, String key2, String key3) {
        HashMap outerMap = huskMap.get(key1);
        if (outerMap == null) {
            return null;
        }
        HashMap innerMap = (HashMap) outerMap.get(key2);
        if (innerMap == null) {
            return null;
        }
        return (String) innerMap.get(key3);
    }
}
