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


