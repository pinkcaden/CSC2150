
public class Main {

    private static double calculateAreaRectangle(double width, double height) {
        return (width * height);
    }

    private static double calculateCircleArea(double radius){
        return(Math.PI * Math.pow(radius, 2));
    }

    private static int add(int a, int b, int c){
        return (a + b + c);
    }
    private static int add(int a, int b){
        return (a + b);
    }

    private static double add(double a, double b, double c){
        return (a + b + c);

    }
    private static double add(double a, double b){

        return (a + b);

    }

    public static void main(String[] args) {
        //System.out.println("Area of " + 3+ " x 4 rectangle: " + calculateAreaRectangle(3, 4));
        //System.out.printf("Area of circle with radius" + 3 + ": %.2f", calculateCircleArea(3));
        System.out.println(add(1, 2, 3));
        System.out.println(add(2, 4));
        System.out.println(add(1.0, 2, 3));
        System.out.println(add(2, 4.0));
        }
    }

