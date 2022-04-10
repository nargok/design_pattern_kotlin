package factory_method.framework

abstract class Factory {
    fun crete(owner: String): Product {
        val p: Product = createProduct(owner)
        registerProduct(p)
        return p
    }

    protected abstract fun createProduct(owner: String): Product
    protected abstract fun registerProduct(product: Product)
}