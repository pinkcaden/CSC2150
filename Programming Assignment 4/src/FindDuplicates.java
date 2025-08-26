import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {4, 3, 2, 7, 8, 2, 3, 1};

        // Call the method to find duplicates and store them in an ArrayList
        ArrayList<Integer> duplicates = findDuplicates(numbers);

        // Print the duplicates
        System.out.println("Duplicate numbers: " + duplicates);
    }

    /*
        TASK: Write a method, that receives an array of numbers, and finds and stores the duplicate numbers
        in a new ArrayList of duplicated numbers and returns it to the caller. You must complete this task in
        O(n). For example, if the method is called and passed an array of [4, 3, 2, 7, 8, 2, 3, 1], it should
        return an ArrayList of [2, 3].
     */
    public static ArrayList<Integer> findDuplicates(int[] numbers) {
        int n = numbers.length;

        // HashSet to track seen numbers
        HashSet<Integer> seen = new HashSet<>();

        // ArrayList to track duplicates
        ArrayList<Integer> duplicates = new ArrayList<>();

        // Iterate through the array
        for (int number : numbers) {
            boolean notDupe = seen.add(number);
            if (!notDupe) {
                duplicates.add(number);
            }
        }
        return duplicates;

        // If the number has already been seen, it's a duplicate
        // Add to the ArrayList

        // Return the ArrayList of duplicates
    }
}
