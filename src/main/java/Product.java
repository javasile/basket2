public interface Product {
    void createProduct(String name,int id, Supplier supplier);
    double returnPrice();
    boolean equals(Object o);
    int hashCode();
}
