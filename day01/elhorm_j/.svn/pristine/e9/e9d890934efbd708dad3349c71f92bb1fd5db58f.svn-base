public class App {

    public int countCharInString(String s, char cInput) {
	int n = 0;

	for (int i = 0; i < s.length(); ++i)
	    if (s.charAt(i) == cInput)
		++n;
	return n;
    }

    public boolean isPalindrom(String word) {
	int i = word.length() -1;
	for (int j = 0; j < word.length() / 2; ++j) {
	    if (word.charAt(i) != word.charAt(j))
		return false;
	    --i;
	}
	return true;
    }

    public boolean verifChars(String word, char c) {
	for (int i = 0; i < word.length(); ++i)
	    if (word.charAt(i) == c)
		return true;
	return false;
    }

    public int countDiffChars(String word) {
	String stock = "";

	for (int i = 0; i < word.length(); ++i)
	    if (!verifChars(stock, word.charAt(i)))
		stock += word.charAt(i);
	return stock.length();
    }
}
