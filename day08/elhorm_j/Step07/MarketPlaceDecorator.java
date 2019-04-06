import java.util.*;

public abstract class MarketPlaceDecorator implements MarketPlace {

    protected MarketPlace marketplace;
    
    public MarketPlaceDecorator(MarketPlace marketPlace) {
	this.marketplace = marketPlace;
    }

    public List<String> getMarketsNames() {
	return marketplace.getMarketsNames();
    }

    public void addMarket(String name) {
	marketplace.addMarket(name);
    }

    
}
