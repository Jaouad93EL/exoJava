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
}
