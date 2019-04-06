import java.util.*;
    
public class MessagesServer implements PushNotificationsAPI {

    private List<User> users;

    public MessagesServer() {
	this.users = new ArrayList<User>();
    }

    public void addUser(User user) {
	this.users.add(user);
    }

    public void removeUser(User user) {
	this.users.remove(user);
    }

    public void sendBroadCastMessage(String message) {
	for (User u : this.users)
	    u.onBroadCastMessageReceived(message,"Server");
    }
    
}
