public interface PushNotificationsAPI {
    public void sendBroadCastMessage(String message);

    interface APNS {
	public void sendMessageToIOS(String message);
    }
    interface FCM {
	void sendMessageToAndroid(String message);
    }
    
}
