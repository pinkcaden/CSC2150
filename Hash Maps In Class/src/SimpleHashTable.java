public class SimpleHashTable {
    private int[] hash;

    private int size;

    public SimpleHashTable(int tableSize){
        hash = new int[tableSize];
        size = tableSize;

        for(int i = 0; i < size; i++){
            
        }

    }

    private int getHash(int n){
        return(n % size);
    }



    public static void main(String[] args) {

    }

}
