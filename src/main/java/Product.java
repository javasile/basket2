public interface Product {
    Product createProduct(String name, int id, Supplier supplier);
    double returnPrice();
    String getName();
    int getId();

}
