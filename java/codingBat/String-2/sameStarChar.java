//Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
//sameStarChar("xy*yzz") → true
//sameStarChar("xy*zzz") → false
//sameStarChar("*xa*az") → true

public class sameStarChar {
    public static void main(String... args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }
    public static boolean sameStarChar(String str) {
        Boolean subString = true;
        for (int i = 1; i < str.length() - 1; i ++) {
            if (str.substring(i, i + 1).equals("*") == true && str.substring(i - 1, i).equals(str.substring(i + 1, i + 2)) == false) {
                subString = false;
            }
        }
        return subString;
    }
}