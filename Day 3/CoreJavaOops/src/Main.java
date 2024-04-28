//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create first string
//        String first = "Java ";
//        System.out.println("First String: " + first);
//
//        // create second
//        String second = "Programming";
//        System.out.println("Second String: " + second);
//
//        // join two strings
//        String joinedString = first.concat(second);
//        System.out.println("Joined String: " + joinedString);

        // ==
        //=

        String first = "java programming";
        String second = "java programming";
        String third = "python programming";

        // compare first and second strings
        boolean result1 = first.equals(second);
        System.out.println("Strings first and second are equal: " + result1);

        // compare first and third strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and third are equal: " + result2);

        String str1 = "Java Programming";
        String str2 = "";

        System.out.println(str1.isEmpty()); // false
        System.out.println(str2.isEmpty()); // true

        String str4 = "bat ball";
        // replace b with c
        System.out.println(str4.replace('b', 'c'));
        System.out.println(str4.replaceAll("b", "c"));

        String str5 = "Java123is456fun";
        // regex for sequence of digits [a-z][0-9][AB_]
        String regex = "\\d+";
        System.out.println(str5.replaceAll(regex, " "));

        System.out.println(str1.charAt(2));

        System.out.println(str1.indexOf("P"));

    }
}