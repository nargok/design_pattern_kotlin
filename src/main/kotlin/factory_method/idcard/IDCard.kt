package factory_method.idcard

import factory_method.framework.Product

class IDCard(
    private val owner: String,
): Product() {

    init {
        println("${owner}のカードを作ります。")
    }

    override fun use() {
        println("${this}のカードを使います。")
    }

    override fun toString(): String {
        return "[ID Card:$owner]"
    }

    fun getOwner(): String {
        return owner
    }
}