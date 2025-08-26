import java.util.HashMap;

public class TwoSum {
    public static int[] twoSums(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        int n = nums.length;
        // {"value of element of nums" : "position of element of nums"
        for (int i = 0; i < n; i++) {
            elements.put(nums[i], i);
        }

        for (int i = 0; i < n; i++) {
            // target = value of element i in nums + complement, if value complement is in nums
            int complement = target - nums[i];
            if (elements.containsKey(complement)) {
                return new int[]{i, elements.get(complement)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSums(nums, target);
        if (result.length != 0) System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        else System.out.println("No two sum solution");
    }
}