import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Promotion {
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
    public LocalDate getFrom() {return this.from;}
    public LocalDate getTo() {return this.to;}
    public void setFrom(LocalDate from) {this.from = from;}
    public void setTo(LocalDate to) {this.to = to;}
}
