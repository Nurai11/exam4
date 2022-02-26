package ex2;

import ex2.enam.ProductType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(1);
        order1.setLocalDate(LocalDate.now());
        order1.setLocalTime(LocalTime.now());

        Product newProduct = new Product();
        newProduct.setName("Apple");
        newProduct.setType(ProductType.FRUIT);
        order1.setProducts(new ArrayList<>());
        order1.getProducts().add(newProduct);


        Order order2 = new Order();
        order2.setId(1);
        order2.setLocalDate(LocalDate.now());
        order2.setLocalTime(LocalTime.now());

        Product newProduct2 = new Product();
        newProduct2.setName("Milk");
        newProduct2.setType(ProductType.MILKY);
        order2.setProducts(new ArrayList<>());
        order2.getProducts().add(newProduct2);

        orders.add(order1);
        orders.add(order2);
        System.out.println(orders );

        orders.remove(order1);
        System.out.println(orders);

        for (int i = 0; i < orders.size(); i ++){
            if (orders.contains(order2)){
                System.out.println(orders.get(i));
            }
        }
    }
}
