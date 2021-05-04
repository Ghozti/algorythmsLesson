package ghozti.mousesquad;

public class Node {
    private int value;
    private Node next;//reference for next node

    public Node(int val){
        this.value = val;
    }

    public int getValue(){
        return value;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node node){
        next = node;
    }
}
