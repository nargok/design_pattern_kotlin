package factory_method

import factory_method.framework.Factory
import factory_method.idcard.IDCardFactory

fun main() {
    val factory: Factory = IDCardFactory()
    val card1 = factory.crete("Hiroyuki")
    val card2 = factory.crete("XXemon")
    val card3 = factory.crete("hiro")
    card1.use()
    card2.use()
    card3.use()
}