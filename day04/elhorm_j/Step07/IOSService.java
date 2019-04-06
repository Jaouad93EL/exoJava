public class IOSService implements PushNotificationsAPI.APNS {
    public void sendMessageToIOS(String message) {
	System.out.println("APNS sending: " + message);
    }
}
