package it.discovery.java8;

import java.util.Objects;

public class Product {

    private final int id;

    private final double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product product = new Product(1, 200);
        Product product2 = new Product(1, 500);
        System.out.println(product.getId());
        System.out.println(product.equals(product2));
    }
}
