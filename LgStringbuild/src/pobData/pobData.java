/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pobData;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author djm
 */
public class pobData {

//    private static Map<Integer, String> myMap2 = new HashMap<Integer, String>() {
//        {
//            put(1, "one");
//            put(2, "two");
//        }
//    };

//    private static Map<String, HashMap> myMap2 = new HashMap<String, HashMap>() {
//        {
//            HashMap<String,String> subSubData1 = new HashMap<String,String>();
//            HashMap<String,String> subSubData2 = new HashMap<String,String>();
//            subSubData1.put("1", "xx");
//            subSubData1.put("2", "xxxxx");
//            subSubData2.put("1", "yy");
//            subSubData2.put("2", "yyyyy");
//
//
//            myMap2.put("1", subSubData1);
//            myMap2.put("2", subSubData2);
//        }
//    };

//    private static Map<String,Map<String,Map<String,String>>> myMap3 = new HashMap<String,Map<String,Map<String,String>>>() {
//        {
//
////                HashMap<String,Map<String,Map<String,String>>> data = new HashMap<String,Map<String,Map<String,String>>>();
//    Map<String,Map<String,String>> subData = new HashMap<String,Map<String,String>>();
//    Map<String,String> subSubData = new HashMap<String,String>();
//        subSubData.put("Triumph", "-2 Intensity, Move forward 1 Zone, Special! (pg. 25)");
//        subData.put("Maneuver", subSubData);
////        data.put("Attack", subData);
//            myMap3.put("Attack", subData);
//
////            putStrings(myMap3, "Offensive", "Attack", "Opponent", "xxxxxx");
//
//        }
//    };


    public HashMap<String,Map<String,Map<String,String>>> populateData() {

        HashMap<String,Map<String,Map<String,String>>> data = new HashMap<String,Map<String,Map<String,String>>>();
//        Map<String, Map<String, String>> subData = new HashMap<String, Map<String, String>>();
//        Map<String, String> subSubData = new HashMap<String, String>();

        putStrings(data, null, null, null, null);
        putStrings(data, "Offensive", "Assault vs. Position ", "Prerequisite", "Position nearby ");
        putStrings(data, "Offensive", "Assault vs. Position ", "Opponent", "Unit(s) in position ");
        putStrings(data, "Offensive", "Attack ", "Prerequisite", "None ");
        putStrings(data, "Offensive", "Attack ", "Opponent", "3 random foes; player choose 1 ");

        return data;
    }

//    public String getStrings(HashMap<String,Map<String,Map<String,String>>> data, String head1, String head2, String head3) {
//        String text = getStrings(data, head1, head2, head3) ;
//        return text ;
//    }
    public static Map putStrings(Map<String,Map<String,Map<String,String>>> data, String head1, String head2, String head3, String text){

//        Map<String, Map<String, Map<String, String>>> internalData = new HashMap<String, Map<String, Map<String, String>>>();
        Map<String, Map<String, String>> internalSubData = new HashMap<String, Map<String, String>>();
        Map<String,String> internalSubSubData = new HashMap<String,String>();

        internalSubSubData.put(head3, text);
        internalSubData.put(head2, internalSubSubData);
        data.put(head1, internalSubData);

        return data;
    }
    public static String getStrings(HashMap<String,Map<String,Map<String,String>>> data, String head1, String head2, String head3){

        Map<String, Map<String, String>> internalSubData = data.get(head1);
        Map<String, String> internalSubSubData = internalSubData.get(head2) ;
        String text = internalSubSubData.get(head3);

        return text;
    }
}
