package MapInterface;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaSortedMap {
    public static void main(String[] args) {

        //Internal - Self balancing  binary search tree
        //Time complexity - O(log n)

        SortedMap<Integer,String> map = new TreeMap<>((a,b)->b-a);
        map.put(1,"Alice");
        map.put(5,"Bob");
        map.put(100,"Tom");
        map.put(30,"Jerry");
       // map.put(null,"Naruto"); //will give error
        System.out.println(map);
        System.out.println(map.firstKey());
//        System.out.println(map.headMap(30));
//        System.out.println(map.tailMap(30));
//        System.out.println(map.subMap(1,30));

        NavigableMap<Integer,String> map1 = new TreeMap<>();
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(10,"Ten");
        map1.put(5,"Five");

        System.out.println(map1);

    }
}
