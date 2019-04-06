import java.util.*;

public class LocationHandler {

    private List<LocationListener> elements;

    public LocationHandler() {
	this.elements = new ArrayList<LocationListener>();
    }

    public void registerListener(LocationListener listener) {
	this.elements.add(listener);
    }

    public void unregisterListener(LocationListener listener) {
	this.elements.remove(listener);
    }

    public void clearListeners() {
	this.elements.clear();
    }

    public void enableGps() {
	for (LocationListener l : this.elements)
	    l.onGpsEnabled();
    }

    public void disableGps() {
	for (LocationListener l : this.elements)
	    l.onGpsDisabled();
    }

    public void changeLocation(String newLocation) {
	for (LocationListener l : this.elements)
	    l.onLocationChanged(newLocation);
    }
    
}
