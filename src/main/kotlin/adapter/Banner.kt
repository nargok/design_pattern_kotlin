package adapter

open class Banner(private val string: String) {
    fun showWithParen(): String {
        return "( $string )"
    }

    fun showWithAster(): String {
        return "* $string *"
    }
}
