import java.util.Objects;

public class GenericProduct implements Product {

    private String name;
    private int id;
    Supplier supplier;

    public double returnPrice(){
        return supplier.getPrice ();
    }


    @Override
    public void createProduct(String name, int id, Supplier supplier) {
        this.name = name;
        this.id = id;
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        GenericProduct that = (GenericProduct) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash (id);
    }
}
