
import java.util.*;

public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        Purchase item = new Purchase(product, 1, price);
        
        Set<String> keys = this.basket.keySet();        
        if (!keys.contains(product)) {
            this.basket.put(product, item);
        } else {
            this.basket.get(product).increaseAmount();
        }

    }

    public int price() {
        int total = 0;
        
        Collection<Purchase> purchase = this.basket.values();        
        for (Purchase count : purchase) {
            total += count.price();
        }
        return total;
    }

    public void print() {        
        Collection<Purchase> puchase = this.basket.values();        
        for (Purchase count : puchase) {
            System.out.println(count.toString());
        }
    }
}
