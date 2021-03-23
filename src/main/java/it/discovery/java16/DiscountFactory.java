package it.discovery.java16;

public class DiscountFactory {

    public static Discount getDiscount(int amount) {
        if (amount < 0 || amount >= 100) {
            throw new IllegalArgumentException("Invalid discount value: " + amount);
        }
        return switch (amount) {
            case 0 -> new NoDiscount();
            case 50 -> new HalfDiscount();
            default -> new Discount(amount);
        };
    }
}
