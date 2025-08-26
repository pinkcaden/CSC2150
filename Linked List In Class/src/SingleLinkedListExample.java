class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }

}

class SingleLinkedList {
    Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    public int getSize() {
        Node go = head;
        int count = 0;
        while (go != null) {
            count++;
            go = go.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList(){

        Node go = head;
        while (go != null){
            System.out.print(go.data + " -> ");
            go = go.next;
        }
        System.out.println("null");
    }

    public boolean search(int value){
        Node go = head;
        while(go != null){
            if (go.data == value){
                return true;

            }
            go = go.next;
        }
        return false;

    }

    public int countInstances(int search) {
        Node go = head;
        int count = 0;

        while (go != null) {

        if (go.data == search) {
            count++;
        }
        go = go.next;
        }
        return count;
    }


    public void append(int value){
        Node go = head;
        if (go == null){
            head = new Node(value);
            return;
        }
        while (go.next != null){
            go = go.next;
        }
        go.next = new Node(value);

    }


    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;


    }


}


public class SingleLinkedListExample {
    public static void main(String[] args) {
        SingleLinkedList myList = new SingleLinkedList();

        myList.append(10);
        myList.append(50);
        myList.append(30);
        myList.append(50);
        myList.append(10);
        myList.append(50);
        myList.append(40);
        myList.append(0);

        myList.printList();
        System.out.println(myList.countInstances(50));
    }
}



