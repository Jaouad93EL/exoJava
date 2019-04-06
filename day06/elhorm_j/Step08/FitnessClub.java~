import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.*;

public class FitnessClub implements Club {

    List<Client> clients;
    List<Promotion> promotions;
    
    public FitnessClub() {
	this.clients = new ArrayList<>();
	this.promotions = new ArrayList<>();
    }
    
    public void removeClient(Client client) {
	for (Client c : this.clients)
	    if (c.equals(client))
		this.clients.remove(client);
    }

    public void addClient(Client client) {
	this.clients.add(client);
    }

    public Client getClientById(String id) {
	for (Client c : this.clients)
	    if (c.getId().equals(id))
		return c;
	return null;
    }

    public ArrayList<String> getClientsIds(String registrationDateFrom, String registrationDateTo) {
	ArrayList<String> cli = new ArrayList<>();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate av = LocalDate.parse(registrationDateFrom, formatter);
	LocalDate ap = LocalDate.parse(registrationDateTo, formatter);

	for (Client c : this.clients)
	    if (c.getBirthday().hashCode() > av.hashCode() && c.getBirthday().hashCode() < ap.hashCode())
		cli.add(c.getId());
	return cli;
    }

    public void addPromotion(Promotion promotion) {
	this.promotions.add(promotion);
    }

    public boolean hasPromotions(String date) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate eq = LocalDate.parse(date, formatter);

	for (Promotion p : this.promotions)
	    if (p.getFrom().hashCode() > eq.hashCode() && p.getTo().hashCode() < eq.hashCode())
		return true;
	return false;
	
    }
}
