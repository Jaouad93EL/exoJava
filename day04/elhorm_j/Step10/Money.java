public class Money {
    private float balance;
    public Money(float balance) {if (balance > 0) {this.balance = balance;}}
    public float getBalance() {return this.balance;}
    public boolean haveMoney() {if (this.balance > 0) return true; return false;}

    public void addBalance(float money) throws NumberErrorException{
	if(money >= 0)
	    this.balance = this.balance + money;
	else
	    throw new NumberErrorException("Impossible to add a negative number!");
    }
    
}
