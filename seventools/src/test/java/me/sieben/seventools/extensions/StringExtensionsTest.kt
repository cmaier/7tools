package me.sieben.seventools.extensions

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import me.sieben.seventools.xtensions.emptyToNull
import me.sieben.seventools.xtensions.nullToEmpty

class StringExtensionsTest : WordSpec() {

    init {

        "String?.emptyToNull()" should {

            "return null if the String is empty" {
                "".emptyToNull() shouldBe null
            }

            "return null if the String is null" {
                (null as String?).emptyToNull() shouldBe null
            }
        }

        "String?.nullToEmpty()" should {

            "return an empty String if the String is null" {
                (null as String?).nullToEmpty() shouldBe ""
            }

            "return an empty String if the String is empty" {
                "".nullToEmpty() shouldBe ""
            }
        }
    }
}
