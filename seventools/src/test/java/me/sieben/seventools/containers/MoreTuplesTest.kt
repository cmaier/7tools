package me.sieben.seventools.containers

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class QuadTest : WordSpec() {

    init {

        "Quad's properties" should {

            "return the constructor parameters" {

                Quad("a", "b", "c", "d").let { tuple ->
                    tuple.first shouldBe "a"
                    tuple.second shouldBe "b"
                    tuple.third shouldBe "c"
                    tuple.fourth shouldBe "d"

                    with(tuple) { Quad(first, second, third, fourth) }
                } shouldBe Quad("a", "b", "c", "d")
            }

            "be in a comma separated string on toString()" {
                Quad("a", "b", "c", "d").toString() shouldBe "(a, b, c, d)"
            }

            "be in a list on toList()" {
                Quad("a", "b", "c", "d").toList() shouldBe listOf("a", "b", "c", "d")
            }
        }
    }
}

class QuinTest : WordSpec() {

    init {

        "Quin's properties" should {

            "return the constructor parameters" {

                Quin("a", "b", "c", "d", "e").let { tuple ->
                    tuple.first shouldBe "a"
                    tuple.second shouldBe "b"
                    tuple.third shouldBe "c"
                    tuple.fourth shouldBe "d"
                    tuple.fifth shouldBe "e"

                    with(tuple) { Quin(first, second, third, fourth, fifth) }
                } shouldBe Quin("a", "b", "c", "d", "e")
            }

            "be in a comma separated string on toString()" {
                Quin("a", "b", "c", "d", "e").toString() shouldBe "(a, b, c, d, e)"
            }

            "be in a list on toList()" {
                Quin("a", "b", "c", "d", "e").toList() shouldBe listOf("a", "b", "c", "d", "e")
            }
        }
    }
}

class HexTest : WordSpec() {

    init {

        "Hex's properties" should {

            "return the constructor parameters" {

                Hex("a", "b", "c", "d", "e", "f").let { tuple ->
                    tuple.first shouldBe "a"
                    tuple.second shouldBe "b"
                    tuple.third shouldBe "c"
                    tuple.fourth shouldBe "d"
                    tuple.fifth shouldBe "e"
                    tuple.sixth shouldBe "f"

                    with(tuple) { Hex(first, second, third, fourth, fifth, sixth) }
                } shouldBe Hex("a", "b", "c", "d", "e", "f")
            }

            "be in a comma separated string on toString()" {
                Hex("a", "b", "c", "d", "e", "f").toString() shouldBe "(a, b, c, d, e, f)"
            }

            "be in a list on toList()" {
                Hex("a", "b", "c", "d", "e", "f").toList() shouldBe listOf("a", "b", "c", "d", "e", "f")
            }
        }
    }
}

class SepTest : WordSpec() {

    init {

        "Sep's properties" should {

            "return the constructor parameters" {

                Sep("a", "b", "c", "d", "e", "f", "g").let { tuple ->
                    tuple.first shouldBe "a"
                    tuple.second shouldBe "b"
                    tuple.third shouldBe "c"
                    tuple.fourth shouldBe "d"
                    tuple.fifth shouldBe "e"
                    tuple.sixth shouldBe "f"
                    tuple.seventh shouldBe "g"

                    with(tuple) { Sep(first, second, third, fourth, fifth, sixth, seventh) }
                } shouldBe Sep("a", "b", "c", "d", "e", "f", "g")
            }

            "be in a comma separated string on toString()" {
                Sep("a", "b", "c", "d", "e", "f", "g").toString() shouldBe "(a, b, c, d, e, f, g)"
            }

            "be in a list on toList()" {
                Sep("a", "b", "c", "d", "e", "f", "g").toList() shouldBe listOf("a", "b", "c", "d", "e", "f", "g")
            }
        }
    }
}
