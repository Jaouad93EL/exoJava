import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Promotion {

    String id;
    int discount;
    int numberOfMonths;
    LocalDate from;
    LocalDate to;

    public Promotion(LocalDate from, LocalDate to) {
	this.from = from;
	this.to = to;
    }

    public boolean isAvailable(LocalDate datefrom) {
	if (datefrom.hashCode() > this.from.hashCode() && datefrom.hashCode() < this.to.hashCode())
	    return true;
	return false;
    }

    public String getId() {return this.id;}
    public int getDiscount() {return this.discount;}
    public int getNumberOfMonths() {return this.numberOfMonths;}
    public LocalDate getFrom() {return this.from;}
    public LocalDate getTo() {return this.to;}

    public void setId(String id) {this.id = id;}
    public void setDiscount(int discount) {this.discount = discount;}
    public void setNumberOfMonths(int numberOfMonths) {this.numberOfMonths = numberOfMonths;} 
    public void setFrom(LocalDate from) {this.from = from;}
    public void setTo(LocalDate to) {this.to = to;}
}
