package MapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapp {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        String s1 = new String("key");
        String s2 = new String("key");
        map.put(s1,1);
        map.put(s2,2);
        /*
         s1 and s2 are two different objects (new String("key") creates a new instance).
         But HashMap uses .equals() to compare keys.
         Since s1.equals(s2) returns true, the second put() overwrites the first.
         */
        System.out.println(map);

        IdentityHashMap<String,Integer> map1 = new IdentityHashMap<>();
        map1.put(s1,1);
        map1.put(s2,2);
        /*
         IdentityHashMap uses == (reference equality).
         s1 and s2 are not the same object, even though they look the same.
         So both entries are stored separately.
         */
        System.out.println(map1);

    }
}
