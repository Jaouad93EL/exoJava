import java.util.*;

public class LinkedListManager {
    
    public static LinkedList getLinkedList() {
	return new LinkedList<>();
    }
    
    public int getLastPositionOf(String x, LinkedList<String> list) {
	int stock = 0;
	for (int i = 0; i < list.size(); ++i) 
	    if (x.equals(list.get(i)))
		stock = i;
	return stock;
    }

    public LinkedList<Integer> updateValue(LinkedList<Integer> x, int position, int value) {
	Integer ger = new Integer(value);
	x.set(position, ger);
	return x;
    }

    public LinkedList<ArrayList<Integer>> splitArray(Integer[] array, int splitSize) {
	LinkedList<ArrayList<Integer>> liste = new LinkedList<ArrayList<Integer>>();
	ArrayList<Integer> array1 = new ArrayList<Integer>();
	ArrayList<Integer> array2 = new ArrayList<Integer>();

	for (int i = 0; i < splitSize; ++i) {
	    Integer ger = new Integer(array[i]);
	    array1.add(ger);
	}
	for (int j = splitSize; j < array.length; ++j) {
	    Integer ger = new Integer(array[j]);
	    array2.add(ger);
	}
	liste.add(array1);
	liste.add(array2);
	return liste;
    }
}
