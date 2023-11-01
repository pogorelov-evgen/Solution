
import java.util.*;

import static java.lang.System.currentTimeMillis;


class Solution  {
    public static void main(String[] args) {
     Map<Integer,String> hashMap = new HashMap<>();
     Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
     Map<Integer,String> treeMap = new TreeMap<>();

     testMap(hashMap);
     testMap(linkedHashMap);
     testMap(treeMap);

    }
    public static void testMap(Map<Integer,String> map) {
        long start = currentTimeMillis();
        map.put(1,"den");
        map.put(5,"den3");
        map.put(51,"den4");
        map.put(187,"den");
        map.put(2,"den5");
        map.put(38,"den");
        map.put(89,"de6n");
        map.put(1578,"7den");
        map.put(67,"de8n");
        map.put(32,"de7n");
        map.put(643,"den");
        map.put(5647,"d4en");
        map.put(543,"de567n");
        map.put(357,"de8hn");
        map.put(365,"defgn");
        long writeTime = currentTimeMillis() - start;
        System.out.println(writeTime);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
        long readTime = currentTimeMillis() - writeTime;
        System.out.println(readTime);
    }

}