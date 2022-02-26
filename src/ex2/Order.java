package ex2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Order {
    private int id;
    private LocalDate localDate;
    private LocalTime localTime;
    private List<Product> products;

    public Order() {
    }

    public Order(int id, LocalDate localDate, LocalTime localTime, List<Product> products) {
        this.id = id;
        this.localDate = localDate;
        this.localTime = localTime;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "id=" + id +
                ", localDate=" + localDate +
                ", localTime=" + localTime +
                ", products=" + products +
                '}';
    }
}
