import java.time.LocalDate;
import ExceptionList.QuantityError;

public class Main {
    public static void main(String[] args) {
        Product tshirt = new GenericProduct ().createProduct ("Tricou",1,new Supplier (5.5, LocalDate.of (2021,11,28)));
        Product shirt = new GenericProduct ().createProduct ("Camasa",2,new Supplier (7.5, LocalDate.of (2021,11,28)));
        Product pants = new GenericProduct ().createProduct ("Pants",3,new Supplier (13.4,LocalDate.now ()));

        Basket basket =  new Basket ();

        try {
            basket  .addProduct (tshirt,3)
                    .addProduct (shirt,2)
                    .addProduct (pants,1);
        } catch (QuantityError e) {
            System.out.println (e.getMessage ());
        }
        basket.removeProduct (shirt,1);

        basket.returnListOfQuantities ().
                forEach ((product, quantity) -> System.out.println (
                        "id :" + product.getId () + " name : " + product.getName ()
                                + " pret :" + product.returnPrice () + " quantity : " + quantity));
        OrderService orderService = new OrderService (basket);
        System.out.println (orderService.totalPrice ());

    }
}
