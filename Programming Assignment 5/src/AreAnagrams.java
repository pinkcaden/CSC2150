import java.util.HashMap;

public class AreAnagrams {
    public static boolean areAnagrams(String s1, String s2) {
        HashMap<Character, Integer> strDifference = new HashMap<>();
        // The difference between two unordered sets of elements is the empty set if and only if the sets are identical
        for (char key : s1.toCharArray()) {
            if (strDifference.containsKey(key)) {
                strDifference.put(key, strDifference.get(key) + 1);
            } else {
                strDifference.put(key, 1);
            }
        }
        for (char key : s2.toCharArray()) {
            if (strDifference.containsKey(key)) {
                strDifference.put(key, strDifference.get(key) - 1);
                if (strDifference.get(key) == 0) {
                    strDifference.remove(key);
                }
            } else {
                // Printing messages during certain points in code helps to test it.
                // The CASE messages helps me determine if the correct portion is running for each test input.
                // Case 1 means string 2 has elements which are not in string 1.
                //System.out.println("CASE 1");
                return false;


            }
        }
        if (strDifference.isEmpty()) {
            // Case 2 means that string 1 = string 2
            //System.out.println("CASE 2");
            return true;
        } else {
            // Case 3 means that string 1 = string 2 + some other element(s)
            //System.out.println("CASE 3");
            return false;
        }
    }


    public static void main(String[] args) {
        // case 2
        String s1 = "listen";
        String s2 = "silent";
        if (areAnagrams(s1, s2)) {
            System.out.printf("\nYes, %s and %s are anagrams\n", s1, s2);
        } else {
            System.out.printf("\nNo, %s and %s are NOT anagrams\n", s1, s2);
        }
        // case 1
        s1 = "hello";
        s2 = "world";
        if (areAnagrams(s1, s2)) {
            System.out.printf("\nYes, %s and %s are anagrams\n", s1, s2);
        } else {
            System.out.printf("\nNo, %s and %s are NOT anagrams\n", s1, s2);
        }
        // case 3
        s1 = "listen!";
        s2 = "listen";
        if (areAnagrams(s1, s2)) {
            System.out.printf("\nYes, %s and %s are anagrams\n", s1, s2);
        } else {
            System.out.printf("\nNo, %s and %s are NOT anagrams\n", s1, s2);
        }
    }
}
