import template_method.AbstractDisplay
import template_method.CharDisplay
import template_method.StringDisplay

fun main() {
    val d1: AbstractDisplay = CharDisplay('H')
    val d2: AbstractDisplay = StringDisplay("hello, kotlin")

    d1.display()
    d2.display()
}