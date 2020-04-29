
import java.util.*;

public class Storehouse {

    private Map<String, Integer> productPriceList;
    private Map<String, Integer> productStockList;

    public Storehouse() {
        this.productPriceList = new HashMap<String, Integer>();
        this.productStockList = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPriceList.put(product, price);
        this.productStockList.put(product, stock);
    }

    public int price(String product) {
        if (!this.productPriceList.containsKey(product)) {
            return -99;
        }
        return this.productPriceList.get(product);
    }

    public int stock(String product) {
        if (!this.productStockList.containsKey(product)) {
            return 0;
        }
        return this.productStockList.get(product);
    }

    public boolean take(String product) {
        if (!this.productStockList.containsKey(product)) {
            return false;
        }       
        
        int decrease = this.productStockList.get(product) - 1;        
        if (decrease >= 0) {
            this.productStockList.put(product, decrease);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> productNames = this.productPriceList.keySet();
        return productNames;
    }
}
