package me.sieben.seventools

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec

class IntentionallyBrokenTest : WordSpec() {

    init {

        "This test" should {

            "fail" { true shouldBe false }
        }
    }
}
