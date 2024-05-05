package CollectionExample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] arg) {
        // ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(20);

        System.out.println(arrayList.get(2));
        System.out.println(arrayList.indexOf(9));

        for(int n: arrayList) {
            System.out.println(n);
        }
    }
}
