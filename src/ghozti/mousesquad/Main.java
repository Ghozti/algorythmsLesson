package ghozti.mousesquad;

public class Main {

    public static void main(String[] args) {
	    Array array = new Array(4);
        array.insert(1);
        array.print();
        array.insert(2);
        array.print();
        array.insert(3);
        array.print();
        array.insert(4);
        array.print();
        array.insert(5);
        array.print();
        array.insert(6);
	    array.removeAt(3);
        System.out.println(array.indexOf(1));
	    array.print();
    }
}
