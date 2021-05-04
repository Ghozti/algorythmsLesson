package ghozti.mousesquad;

public class LinkedList {

    private Node first;
    private Node last;

    public void addFirst(int val){

    }

    public void addLast(int val){
        var node = new Node(val);

        if(first == null){
            first = last = node;
        }else {
            last.setNext(node);
        }
    }

    public void deleteFirst(){

    }

    public void deleteLast(){

    }

    public boolean contains(int val){
        return false;
    }

    public int indexOf(int val){
        return -1;
    }
}
