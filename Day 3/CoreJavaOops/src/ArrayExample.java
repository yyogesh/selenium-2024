public class ArrayExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        int[] a = {10, 20, 30};

        System.out.println(a[2]);

        for(int i = 0; i<a.length; i++) {
            System.out.println("value of index:: " + i + " Value ::" + a[i]);
        }

        for(int item: a) {
            System.out.println("array item is:: " + item);
        }

        System.out.println(a[4]);

    }
}
