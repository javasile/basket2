import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {


    private final Map<Product, Integer> quantityList;
    private final List<Product> productList;

    public Basket() {
        productList = new ArrayList<> ();
        quantityList = new HashMap<> ();
    }

    public void addProduct(Product product, int quantity) {
        if (hasProduct (product)) {
            int prevoiusValue = quantityList.get (product);
            quantityList.replace (product, prevoiusValue + quantity);
        } else {
            productList.add (product);
            quantityList.put (product, quantity);
        }
    }

    public void removeProduct(Product product, int quantity) {
        if (hasProduct (product)) {
            int newValue = quantityList.get (product) - quantity;
            if (newValue > 1) {
                quantityList.replace (product, newValue);
            } else {
                quantityList.remove (product);
                productList.remove (product);
            }
        }
    }

    public List<Product> getItems() {
        return new ArrayList<> (productList);
    }

    private boolean hasProduct(Product product) {
        return quantityList.containsKey (product);

    }

    public Map<Product,Integer> returnListOfQuantities() {
        return new HashMap<> (quantityList);
    }
}


