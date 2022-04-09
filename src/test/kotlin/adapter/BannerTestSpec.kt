package adapter

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class BannerTestSpec : AnnotationSpec() {
    @Test
    fun `showWithParen return string with parentheses`() {
        val string = "test"
        val banner = Banner(string)
        banner.showWithParen() shouldBe "( $string )"
    }
}
