public class Watch implements LocationListener {

    public void onLocationChanged(String newLocation) {
	System.out.println("Watch: onLocationChanged: " + newLocation);
    }

    public void onGpsDisabled() {
	System.out.println("Watch: onGpsDisabled");
    }

    public void onGpsEnabled() {
	System.out.println("Watch: onGpsEnabled");
    }
}
