package CollectionExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] arg) {
        Map<String, Integer> arrayList = new HashMap<>();
        arrayList.put("X1", 5);
        arrayList.put("X2", 9);
        arrayList.put("X3", 20);


        System.out.println(arrayList.get("X2"));

//        for(String key: arrayList.keySet()) {
//            System.out.println(arrayList.get(key));
//        }
    }
}
