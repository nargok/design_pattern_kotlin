package factory_method.idcard

import factory_method.framework.Factory
import factory_method.framework.Product

class IDCardFactory: Factory() {
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        println("${product}を登録しました")
    }
}