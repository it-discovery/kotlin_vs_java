package it.discovery.java16;

import java.util.Objects;

public record Product(int id, double price) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(o instanceof Product product) {
            return id == product.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product product = new Product(1, 200);
        Product product2 = new Product(1, 500);
        System.out.println(product.id());
        System.out.println(product.equals(product2));
    }
}
