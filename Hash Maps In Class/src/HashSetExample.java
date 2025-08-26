import java.util.HashSet;


public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();

        hSet.add("Caden");
        hSet.add("SJ");
        hSet.add("Nick");
        hSet.add("Ethan");
        hSet.add("Marisa");

        System.out.println(hSet.size());

        System.out.println("Can Nick be added? " + hSet.add("Nick"));

        System.out.println("Contains Gilbert? " + hSet.contains("Gilbert"));

        for (String element : hSet){
            System.out.println(element);
        }

    }




}
