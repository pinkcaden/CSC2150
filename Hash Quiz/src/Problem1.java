import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {

    static void initialize(int[] table){
        for (int i = 0; i < table.length; i++){
            table[i] = -1;
        }
    }

    static int hashCode(int[] table, int key){
        return (key % table.length);
    }

    static void tableInsert(int[] table, int key){
        int element = hashCode(table, key);
        boolean inserted = false;
        int offset = 0;
        while (inserted == false){
            if (table[element + offset] == -1){
                table[element + offset] = key;
                inserted = true;
            } else {
                offset = offset + 1;
            }

        }

    }

    public static void main(String[] args) {
    int[] grades = new int[10];

    initialize(grades);
    tableInsert(grades, 97);
    tableInsert(grades, 87);
    tableInsert(grades, 45);
    tableInsert(grades, 35);

    System.out.println(Arrays.toString(grades));

    }


}
