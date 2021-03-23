import it.discovery.java8.Discount
import it.discovery.java8.HalfDiscount
import it.discovery.java8.NoDiscount

fun main(args: Array<String>) {
    println("Kotlin VS Java")
}

data class Product(val id: Int, val price: Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        return other is Product && id == other.id
    }

    override fun hashCode() = id
}

class Discount(val discount: Double = 0.0)

object DiscountFactory {
    fun getDiscount(amount: Int): Discount {
        return when {
            amount == 0 -> NoDiscount()
            amount == 50 -> HalfDiscount()
            amount < 0 || amount >= 100 -> throw
                IllegalArgumentException("Invalid discount value: $amount")
            else -> Discount(amount.toDouble())
        }
    }
}

class HalfDiscount : Discount(50.0)

class NoDiscount : Discount(0.0)




