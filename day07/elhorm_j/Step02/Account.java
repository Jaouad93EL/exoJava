public class Account<T, V> {

    private T id;
    private V sum;
    
    public Account(T id, V sum) {
	this.id = id;
	this.sum = sum;
    }

    public void setId(T id) {this.id = id;}
    public void setSum(V sum) {this.sum = sum;}

    public T getId() {return this.id;}
    public V getSum() {return this.sum;}
}
