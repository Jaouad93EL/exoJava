public class Book {
    private String id;
    private String title;
    private Author author;

    public Book(String id) {
	this.id = id;
    }

    public void setId(String id) {this.id = id;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(Author author) {this.author = author;}

    public String getId() {return this.id;}
    public String getTitle() {return this.title;}
    public Author getAuthor() {return this.author;}

    
    
}
