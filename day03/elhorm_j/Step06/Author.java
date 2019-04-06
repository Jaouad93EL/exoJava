public class Author extends Person {

    String[] books;

    public Author(int maxBooks) {
	this.books = new String[maxBooks];
    }

    public void addBook(String id) {
	for(int i = 0; i < this.books.length; ++i)
	    if (this.books[i] == null) {
		this.books[i] = id;
		return;
	    }
    }
    
}
