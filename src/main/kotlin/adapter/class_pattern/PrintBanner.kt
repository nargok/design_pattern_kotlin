package adapter.class_pattern

import adapter.Banner


class PrintBanner(
    private val string: String
) : Banner(string), Print {

    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}