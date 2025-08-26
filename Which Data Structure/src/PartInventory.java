
import java.util.HashMap;

class Part{
    private String name;
    private String desc;
    private int count;
    public Part(String name, String desc, int count){
        this.name = name;
        this.desc = desc;
        this.count = count;
    }
    public void printPart(){
        System.out.println(this.name + ", " + this.desc + ", " + this.count);
    }
}

public class PartInventory {
    HashMap<String, Part> inv;
    public PartInventory(){
        this.inv = new HashMap<String, Part>();
    }
    public void LogPart(String id, String name, String desc, int count){
        Part part = new Part(name, desc, count);
        this.inv.put(id, part);
    }
    public void printInventory(){
        for (String key : this.inv.keySet()){
            System.out.print("Part " + key + ": ");
            this.inv.get(key).printPart();
        }
    }


    public static void main(String[] args) {
        PartInventory pinkSolutionsInv = new PartInventory();
        pinkSolutionsInv.LogPart("P101", "Ryobi 11.5\" Ruler",
                "Almost a foot", 22);
        pinkSolutionsInv.LogPart("P102", "DeWalt 13\" Ruler",
                "Definitely a foot", 27);
        pinkSolutionsInv.printInventory();

    }
}
