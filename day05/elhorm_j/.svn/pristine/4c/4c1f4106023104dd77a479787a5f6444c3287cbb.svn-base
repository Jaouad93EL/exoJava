import java.util.*;

public class ListManager {

    public static ArrayList<String> getEmptyList() {
	return new ArrayList<String>();
    }

    public static int addToList(List<String> list, int position, String element) {
	list.add(position, element);
	return list.size();
    }

    public static ArrayList<Integer> getListOfNumbers(int from, int to) {
	ArrayList<Integer> ft = new ArrayList<Integer>();
	
	while (from <= to) {
	    Integer ger = new Integer(from);
	    ft.add(ger);
	    ++from;
	}
	return ft;
    }

    public static ArrayList<Integer> getReversedListOfNumbers(int from, int to) {
	ArrayList<Integer> ft = new  ArrayList<Integer>();

	while (from <= to) {
	    Integer ger = new Integer(to);
	    ft.add(ger);
	    --to;
	}
	return ft;
    }

    public static boolean removeLastFirst(ArrayList list) {
	int n = list.size() - 2;
	list.remove(0);
	list.remove(list.size() - 1);
	if (n == list.size())
	    return true;
	return false;
    }

    public static void swap(List<String> listOne, int x, int y) {
	String stock = "" + listOne.get(x);
	listOne.set(x, listOne.get(y));
	listOne.set(y, stock);

	for (String l : listOne)
	    System.out.println(l);
    }

    public static List<String> getListFromArray(String[] array) {
	List<String> stock = new ArrayList<String>();

	for (int i = 0; i < array.length; ++i)
	    stock.add(array[i]);
	return stock;
    }

    public static void sortByAlphabet(List<String> list) {
	String stock = "";
	
	for (int i = 0; i < list.size() -1; ++i) {
	    for (int j = 0; j < list.size() -1; ++j) {
		if (list.get(j).hashCode() > list.get(j + 1).hashCode()) {
		    stock = list.get(j);
		    list.set(j, list.get(j + 1));
		    list.set(j + 1, stock);
		}
	    }
	}
    }

    public static List<String> getReversedListFromArray(String[] array) {
	List<String> stock = new ArrayList<String>();

	for (int i = array.length; i > 0; --i)
	    stock.add(array[i]);
	return stock;
    }
    
}
