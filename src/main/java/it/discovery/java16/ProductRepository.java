package it.discovery.java16;

public interface ProductRepository {

    String DEFAULT_QUERY  = """
               SELECT * FROM PRODUCT p
            inner join Category c ON c.id=p.category_id
            WHERE c.enabled = 1""";

    public static void main(String[] args) {
        System.out.println(DEFAULT_QUERY.indent(10));
        System.out.println(DEFAULT_QUERY.stripLeading());
    }
}
