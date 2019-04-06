import java.util.*;

public class ProductsRetriever {

    private Amazon amazon;
    private Fnac fnac;
    private CDiscount cdiscount;

    public ProductsRetriever() {
	this.amazon = new Amazon();
	this.fnac = new Fnac();
	this.cdiscount = new CDiscount();
    }

    public void addProductToAmazon(String id) {this.amazon.addProduct(id);}
    public void addProductToCdiscount(String id) {this.cdiscount.addProduct(id);}
    public void addProductToFnac(String id) {this.fnac.addProduct(id);}

    public List<String> getAmazonList() {return this.amazon.getProducts();}
    public List<String> getCdiscountList() {return this.cdiscount.getProducts();}
    public List<String> getFnacList() {return this.fnac.getProducts();}
}
