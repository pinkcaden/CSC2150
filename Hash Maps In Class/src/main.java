




public class main {

    public static int[] shiftArray(int[] arr, int shift) {
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            copy[(i + shift) % arr.length] = arr[i];
        }
        return copy;
    }

    public static int doHash(int n){
        return (n % 10);
    }


    public static void main(String[] args) {
        int[] newList = new int[10];
        for (int i = 0; i < newList.length; i++){
            newList[i] = -1;
        }
        int index = doHash(97);

        newList[index] = 97;

        if (newList[doHash(37)] == 37){
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }



    }
}
