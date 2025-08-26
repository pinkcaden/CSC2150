import java.util.ArrayList;

public class EvenOddArrangement {
    public static void main(String[] args) {
        // Sample ArrayList of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Call the method to rearrange even numbers before odd numbers
        ArrayList<Integer> arrangedList = arrangeEvenBeforeOdd(numbers);

        // Print the rearranged list
        System.out.println("Rearranged List: " + arrangedList);
    }

/*
    TASK: Write a method to return an ArrayList so that
    even numbers comes before odd numbers. For example, the array is
    [5, 9, 22, 2, 4], after calling the method, the returned ArrayList is
    [22, 2, 4, 5, 9].
 */

    public static ArrayList<Integer> arrangeEvenBeforeOdd(ArrayList<Integer> numbers) {
        // Create a new ArrayList to store the result
        ArrayList<Integer> arranged = new ArrayList<>();

        // Add all even numbers first

        for (Integer number : numbers){
            if (number%2 == 0){
                arranged.add(number);
            }
        }

        // Add all odd numbers next
        for (Integer number : numbers){
            if (number%2 == 1){
                arranged.add(number);
            }
        }

        // Return the result
        return arranged;
    }
}
