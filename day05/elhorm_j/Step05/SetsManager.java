import java.util.*;

public class SetsManager {

    public Set<String> getUrls(ArrayList<String> list) {
	Set<String> set =  new HashSet<String>();

	for (String s : list)
	    if (s.startsWith("https"))
		set.add(s);
	return set;
    }

    public Set<Integer> getModulus(ArrayList<Integer> list, int value) {
	Set<Integer> set =  new HashSet<Integer>();
	int k = 0;
	for (Integer i : list) {
	    set.add(i % value);
	}
	return set;
    }
}
