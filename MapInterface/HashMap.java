package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class javaHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Alice");
        map.put(2,"Bob");
        map.put(3,"Jerry");
        map.put(4,"Tom");
        map.put(1,"John"); //Modifies index 1
        System.out.println(map);

        //Loop in hashmap is using keyset.

        Set<Integer> entry = map.keySet();
        for ( Integer i : entry)
        {
            System.out.println(map.get(i));
        }

        //Entry set helps to access key and value together.

        for (Map.Entry<Integer, String> entryy : map.entrySet()) {
            System.out.println(entryy.getKey() + " - " + entryy.getValue());
        }

        System.out.println("Is 3 present in the map- "+ map.containsKey(3));
        System.out.println("Is Alice present in the map- "+ map.containsValue("Alice"));

    }
}
