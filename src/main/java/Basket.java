import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ExceptionList.QuantityError;

public class Basket {


    private final Map<Product, Integer> quantityList;
    private final List<Product> productList;

    public Basket() {
        productList = new ArrayList<> ();
        quantityList = new HashMap<> ();
    }

    public Basket addProduct(Product product, int quantity) throws QuantityError {
        if (checkQuantity (quantity)){
            throw new QuantityError ("Invalid quantity");
        }
        if (hasProduct (product)) {
            int prevoiusValue = quantityList.get (product);
            quantityList.replace (product, prevoiusValue + quantity);
        } else {
            productList.add (product);
            quantityList.put (product, quantity);
        }
        return this;
    }

    private boolean checkQuantity(int quantity){
        return quantity < 1;
    }

    public Basket removeProduct(Product product, int quantity) {
        if (hasProduct (product)) {
            int newValue = quantityList.get (product) - quantity;
            if (newValue > 0) {
                quantityList.replace (product, newValue);
            } else {
                quantityList.remove (product);
                productList.remove (product);
            }
        }
        return this;
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


