public class firstHalf{
    public static void main(String... args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }
    public static String firstHalf(String str) {
        int evenLength = str.length() / 2;
        return str.substring(0, evenLength);
    }
}

//Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//firstHalf("WooHoo") → "Woo"
//firstHalf("HelloThere") → "Hello"
//firstHalf("abcdef") → "abc"