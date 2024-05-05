package CollectionExample;

import java.util.*;

public class SetExample {
    public static void main(String[] arg) {
        // ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> arrayList = new TreeSet<>();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(20);
        arrayList.add(5);

//        System.out.println(arrayList.fi(2));
//        System.out.println(arrayList.indexOf(9));

        for(int n: arrayList) {
            System.out.println(n);
        }
    }
}
