import java.util.*;

public class FilteredProductsDecorator extends MarketPlaceDecorator {

    public FilteredProductsDecorator(MarketPlace marketPlace) {
	super(marketPlace);
    }

    @Override
    public List<String> getMarketsNames() {
	List<String> l = this.marketplace.getMarketsNames();
	List<String> ret = new ArrayList<String>();

	for (String s : l)
	    if (s.startsWith("fr-"))
		ret.add(s);
	return ret;
    }
}
