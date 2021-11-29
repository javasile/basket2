import java.time.LocalDate;

public class Supplier {
    private double price;
    private LocalDate date;

    public Supplier(double price, LocalDate date) {
        this.price = price;
        this.date = date;
    }

    public boolean checkAvaibility(){
        return date.isBefore(LocalDate.now());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
