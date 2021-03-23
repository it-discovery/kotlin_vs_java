package it.discovery.java8;

public interface ProductRepository {

    String DEFAULT_QUERY  = "SELECT * FROM PRODUCT p " +
            "inner join Category c ON c.id=p.category_id " +
            "WHERE c.enabled = 1";
}
