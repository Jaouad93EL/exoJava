public class Smartphone implements LocationListener {

    public void onLocationChanged(String newLocation) {
	System.out.println("Smartphone: onLocationChanged: " + newLocation);
    }

    public void onGpsDisabled() {
	System.out.println("Smartphone: onGpsDisabled");
    }

    public void onGpsEnabled() {
	System.out.println("Smartphone: onGpsEnabled");
    }

    
}
