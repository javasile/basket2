public class GenericProduct implements Product {

    private String name;
    private int id;
    Supplier supplier;


    @Override
    public void createProduct(String name, int id, Supplier supplier) {
        this.name = name;
        this.id = id;
        this.supplier = supplier;
    }
}
