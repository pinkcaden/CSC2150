package New;

import java.util.HashMap;

public class New {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Papa Bones", 70);

        myMap.put("Max Naughton", 1);

        myMap.put("Gon Freecs", 12);

        myMap.put("Marlene Zanardi", 80);

        System.out.println("Attending:" );
        for (String k: myMap.keySet()){
            System.out.println("Name: " + k + " Age: " + myMap.get(k));
        }
        if (myMap.containsKey("Gon Freecs")){
            System.out.println("Gon is present.");
        }

    }

    void kickOutMinors(HashMap<String, Integer>){


    }


}
