
package ListAssigment;

public class Node {
    
    public int value;
    public Node next;
    
    
    //constructores
    public Node() {
       
    }
    
    public Node (int value){
        this.value = value; 
    }
  
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    //getters and setters 
       
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
