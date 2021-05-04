package ghozti.mousesquad;

public class DataStructures {

    /**
     * Arrays -
     *
     * they are the simplest data  structure and can be used tos tore a list of items. These items are stored sequentially in memory.
     * The Arrays class can be used for a lot of things. Such as converting an arrau to a string. the syntax for that is:
     * Arrays.toString(array);
     * this is far more efficient than having to use a for loop.
     *
     *******************************************************************************************************************
     * Dynamic arrays-
     * Java has 2 implementations of dynamic arrays. Vector, and Arraylist.
     * some differences:
     *
     * vectors - will grow 100% of it's size everytime it gets full
     * array lists - will grow 50% of it's size everytime it gets full
     *
     * vectors - all methods are synchronized (only a single thread can access that method)
     * array lists - not synchronized
     *
     * <> these brackets represent a generic parameter. With this, you specify the type of each element in each array list.
     *  ex: to have an array list of integers we type: ArrayList<Integer> name;
     *
     *  in arrayLists we can use the toArray method to convert the arraylist to an array
     *
     *******************************************************************************************************************
     *
     * Linked lists - Unlike arrays, linked lists can grow and shrink automatically
     * a linked lists consists of a group of nodes in sequence (node - a point at which lines or pathways intersect or branch)
     * Each node holds two pieces of data.
     *
     * nodes can be visualized like so:
     * [10, ] --> [20, ] --> [30, ]
     *
     * on the left we store the value of the node, on the right we store an address of the next node in the list.
     * each node points to or references the next. This gives the data structure it's name, each list is linked together.
     *
     * we call the first node the head and the last the tail.
     *  (head)[10, ] --> [20, ] --> [30, ](tail)
     *
     *  runtime complexities-
     *  lookup - O(n)
     *  lookup by index - O(n)
     *
     *  insert - O(1)
     *  insert at beginning - O(1)
     *  insert at middle - O(n)
     *
     *  delete beginning - O(1)
     *  delete end - O(n)
     *  delete middle - O(n)
     *
     *  you can store any type of object in a linked list by simple not specifying the type in the <> generic parameter.
     *  ex: LinkedList e = new LinkedList();
     */
}
