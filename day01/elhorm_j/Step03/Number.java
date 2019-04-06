public class Number {

    public int getModulus(int i1, int i2) {
	if (i2 != 0)
	    return i1 % i2;
	return -1;
    }

    public int getMin(int[] i) {
	int stock = i[0];

	for (int k = 0; k < i.length; ++k)
	    if (stock > i[k])
		stock = i[k];
	return stock;
    }

    public int getMax(int[] i) {
	int stock = i[0];
	
	for (int k = 0; k < i.length; ++k)
	    if (stock < i[k])
		stock = i[k];
	return stock;
    }

    public int[] sort(int[] tab) {
	int stock;
	
	for (int i = 0; i < tab.length -1; ++i) {
	    for (int j = 0; j < tab.length -1; ++j) {
		if (tab[j] > tab[j + 1]) {
		    stock = tab[j];
		    tab[j] = tab[j + 1];
		    tab[j + 1] = stock;
		}
	    }
	}
	return tab;
    }

    public int getSum(int[] i) {
	int stock = 0;

	for (int k = 0; k < i.length; ++k)
	    stock += i[k];
	return stock;
    }
}
