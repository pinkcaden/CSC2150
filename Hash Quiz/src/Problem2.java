import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Problem2 {
    public static HashSet<Integer> storeNumbers(ArrayList<Integer> numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : numbers) {
            set.add(value);
        }
        return set;
    }

        public static void main (String[]args){
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            System.out.println(storeNumbers(numbers));
        }
    }

