public class Printer {

    public <T> void print(T[] word) {
	for (int i = 0; i < word.length; ++i)
	    System.out.println(word[i]);
    }
}
