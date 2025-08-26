

public class Main{

    public static void function(int x){
        if (x == 0){
            return;
        }
        System.out.println("Hello " + x);
        function(x - 1);
    }

    public static int sumOfX(int x) {
        if (x == 0){
            return 0;
        }
        return (x + sumOfX(x - 1));
    }

    public static int factOfX(int x){
        // Use recursion to find the factorial of x
        return (x-1);
    }


    public static void main(String[] args) {

    }

}