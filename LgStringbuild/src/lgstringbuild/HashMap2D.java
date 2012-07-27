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
public class HashMap2D {

    private HashMap<String, HashMap> outerMap;

    public HashMap2D() {
        outerMap = new HashMap<String, HashMap>();
    }

    public void addElement(String key1, String key2, String value) {
        HashMap innerMap = outerMap.get(key1);
        if (innerMap == null) {
            innerMap = new HashMap<String, String>();
            outerMap.put(key1, innerMap);
        }
        innerMap.put(key2, value);
    }

    public String getElement(String key1, String key2) {
        HashMap innerMap = outerMap.get(key1);
        if (innerMap == null) {
            return null;
        }
        return (String) innerMap.get(key2);
    }
}
