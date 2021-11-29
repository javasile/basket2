import java.util.Objects;

public class GenericProduct implements Product {

    private String name;
    private int id;
    Supplier supplier;

    public double returnPrice(){
        return supplier.getPrice ();
    }


    @Override
    public Product createProduct(String name, int id, Supplier supplier) {
        this.name = name;
        this.id = id;
        this.supplier = supplier;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericProduct that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash (id);
    }
}
