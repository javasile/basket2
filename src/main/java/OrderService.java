public class OrderService {
    Basket basket;

    public OrderService(Basket basket) {
        this.basket = basket;
    }

    public double totalPrice(){
        return basket.getItems ()
                .stream ()
                .map (product -> product.returnPrice () * basket.returnListOfQuantities ().get (product))
                .reduce (0.0,Double::sum);
    }
}
