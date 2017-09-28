package me.sieben.seventools.extensions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
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