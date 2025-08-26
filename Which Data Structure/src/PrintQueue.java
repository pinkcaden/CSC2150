import java.util.Comparator;
import java.util.PriorityQueue;

class Document{
    String name;
    int pages;
    int priority;
    public Document(String name, int pages, int priority){
        this.name = name;
        this.pages = pages;
        this.priority = priority;
    }
}



public class PrintQueue {
    PriorityQueue<Document> queue;
    public PrintQueue(){
        this.queue = new PriorityQueue<Document>(Comparator.reverseOrder());
    }


}
