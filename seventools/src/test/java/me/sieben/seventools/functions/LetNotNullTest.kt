@file:Suppress("DEPRECATION")

package me.sieben.seventools.functions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec
import me.sieben.seventools.containers.Hex
import me.sieben.seventools.containers.Quad
import me.sieben.seventools.containers.Quin
import me.sieben.seventools.containers.Sep

class PairLetNotNullTest : WordSpec() {

    init {

        "Pairs's letNotNull" should {

            "call the block w/ the tuple's properties" {

                Pair("a", "b").letNotNull { first, second ->
                    first shouldBe "a"
                    second shouldBe "b"
                    true
                } shouldBe true
            }

            "not call the block w/ the tuple's properties" {

                (Pair("a", null).letNotNull { _, _ -> true } ?: false) shouldBe false
                (Pair(null, "b").letNotNull { _, _ -> true } ?: false) shouldBe false
                (Pair(null, null).letNotNull { _, _ -> true } ?: false) shouldBe false
            }

            "call the block w/ a new tuple" {

                Pair("a", "b").letNotNull { (first, second) ->
                    first shouldBe "a"
                    second shouldBe "b"
                    true
                } shouldBe true
            }

            "not call the block w/ a new tuple" {

                (Pair("a", null).letNotNull { _ -> true } ?: false) shouldBe false
                (Pair(null, "b").letNotNull { _ -> true } ?: false) shouldBe false
                (Pair(null, null).letNotNull { _ -> true } ?: false) shouldBe false
            }
        }
    }
}

class TripleLetNotNullTest : WordSpec() {

    init {

        "Triple's letNotNull" should {

            "call the block w/ the tuple's properties" {

                Triple("a", "b", "c").letNotNull { first, second, third ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    true
                } shouldBe true
            }

            "not call the block w/ the tuple's properties" {

                (Triple("a", "b", null).letNotNull { _, _, _ -> true } ?: false) shouldBe false
                (Triple("a", null, "c").letNotNull { _, _, _ -> true } ?: false) shouldBe false
                (Triple(null, "b", "c").letNotNull { _, _, _ -> true } ?: false) shouldBe false
                (Triple(null, null, null).letNotNull { _, _, _ -> true } ?: false) shouldBe false
            }

            "call the block w/ a new tuple" {

                Triple("a", "b", "c").letNotNull { (first, second, third) ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    true
                } shouldBe true
            }

            "not call the block w/ a new tuple" {

                (Triple("a", "b", null).letNotNull { _ -> true } ?: false) shouldBe false
                (Triple("a", null, "c").letNotNull { _ -> true } ?: false) shouldBe false
                (Triple(null, "b", "c").letNotNull { _ -> true } ?: false) shouldBe false
                (Triple(null, null, null).letNotNull { _ -> true } ?: false) shouldBe false
            }
        }
    }
}

class QuadLetNotNullTest : WordSpec() {

    init {

        "Quad's letNotNull" should {

            "call the block w/ the tuple's properties" {

                Quad("a", "b", "c", "d").letNotNull { first, second, third, fourth ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    true
                } shouldBe true
            }

            "not call the block w/ the tuple's properties" {

                (Quad("a", "b", "c", null).letNotNull { _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quad("a", "b", null, "d").letNotNull { _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quad("a", null, "c", "d").letNotNull { _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quad(null, "b", "c", "d").letNotNull { _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quad(null, null, null, null).letNotNull { _, _, _, _ -> true }
                        ?: false) shouldBe false
            }

            "call the block w/ a new tuple" {

                Quad("a", "b", "c", "d").letNotNull { (first, second, third, fourth) ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    true
                } shouldBe true
            }

            "not call the block w/ a new tuple" {

                (Quad("a", "b", "c", null).letNotNull { _ -> true } ?: false) shouldBe false
                (Quad("a", "b", null, "d").letNotNull { _ -> true } ?: false) shouldBe false
                (Quad("a", null, "c", "d").letNotNull { _ -> true } ?: false) shouldBe false
                (Quad(null, "b", "c", "d").letNotNull { _ -> true } ?: false) shouldBe false
                (Quad(null, null, null, null).letNotNull { _, _, _, _ -> true }
                        ?: false) shouldBe false
            }
        }
    }
}

class QuinLetNotNullTest : WordSpec() {

    init {

        "Quin's letNotNull" should {

            "call the block w/ the tuple's properties" {

                Quin("a", "b", "c", "d", "e").letNotNull { first, second, third, fourth, fifth ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    fifth shouldBe "e"
                    true
                } shouldBe true
            }

            "not call the block w/ the tuple's properties" {

                (Quin("a", "b", "c", "d", null).letNotNull { _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quin("a", "b", "c", null, "e").letNotNull { _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quin("a", "b", null, "d", "e").letNotNull { _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quin("a", null, "c", "d", "e").letNotNull { _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quin(null, "b", "c", "d", "e").letNotNull { _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Quin(null, null, null, null, null).letNotNull { _, _, _, _, _ -> true }
                        ?: false) shouldBe false
            }

            "call the block w/ a new tuple" {

                Quin("a", "b", "c", "d", "e").letNotNull { (first, second, third, fourth, fifth) ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    fifth shouldBe "e"
                    true
                } shouldBe true
            }

            "not call the block w/ a new tuple" {

                (Quin("a", "b", "c", "d", null).letNotNull { _ -> true } ?: false) shouldBe false
                (Quin("a", "b", "c", null, "e").letNotNull { _ -> true } ?: false) shouldBe false
                (Quin("a", "b", null, "d", "e").letNotNull { _ -> true } ?: false) shouldBe false
                (Quin("a", null, "c", "d", "e").letNotNull { _ -> true } ?: false) shouldBe false
                (Quin(null, "b", "c", "d", "e").letNotNull { _ -> true } ?: false) shouldBe false
                (Quin(null, null, null, null, null).letNotNull { _ -> true }
                        ?: false) shouldBe false
            }
        }
    }
}

class HexLetNotNullTest : WordSpec() {

    init {

        "Hex's letNotNull" should {

            "call the block w/ the tuple's properties" {

                Hex("a", "b", "c", "d", "e", "f").letNotNull { first, second, third, fourth, fifth, sixth ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    fifth shouldBe "e"
                    sixth shouldBe "f"
                    true
                } shouldBe true
            }

            "not call the block w/ the tuple's properties" {

                (Hex("a", "b", "c", "d", "e", null).letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Hex("a", "b", "c", "d", null, "f").letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Hex("a", "b", "c", null, "e", "f").letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Hex("a", "b", null, "d", "e", "f").letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Hex("a", null, "c", "d", "e", "f").letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Hex(null, "b", "c", "d", "e", "f").letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Hex(null, null, null, null, null, null).letNotNull { _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
            }

            "call the block w/ a new tuple" {

                Hex("a", "b", "c", "d", "e", "f").letNotNull { (first, second, third, fourth, fifth, sixth) ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    fifth shouldBe "e"
                    sixth shouldBe "f"
                    true
                } shouldBe true
            }

            "not call the block w/ a new tuple" {

                (Hex("a", "b", "c", "d", "e", null).letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Hex("a", "b", "c", "d", null, "f").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Hex("a", "b", "c", null, "e", "f").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Hex("a", "b", null, "d", "e", "f").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Hex("a", null, "c", "d", "e", "f").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Hex(null, "b", "c", "d", "e", "f").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Hex(null, null, null, null, null, null).letNotNull { _ -> true }
                        ?: false) shouldBe false
            }
        }
    }
}

class SepLetNotNullTest : WordSpec() {

    init {

        "Sep's letNotNull" should {

            "call the block w/ the tuple's properties" {

                Sep("a", "b", "c", "d", "e", "f", "g").letNotNull { first, second, third, fourth, fifth, sixth, seventh ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    fifth shouldBe "e"
                    sixth shouldBe "f"
                    seventh shouldBe "g"
                    true
                } shouldBe true
            }

            "not call the block w/ the tuple's properties" {

                (Sep("a", "b", "c", "d", "e", "f", null).letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", "c", "d", "e", null, "g").letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", "c", "d", null, "f", "g").letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", "c", null, "e", "f", "g").letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", null, "d", "e", "f", "g").letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep("a", null, "c", "d", "e", "f", "g").letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep(null, "b", "c", "d", "e", "f", "g").letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
                (Sep(null, null, null, null, null, null, null).letNotNull { _, _, _, _, _, _, _ -> true }
                        ?: false) shouldBe false
            }

            "call the block w/ a new tuple" {

                Sep("a", "b", "c", "d", "e", "f", "g").letNotNull { (first, second, third, fourth, fifth, sixth, seventh) ->
                    first shouldBe "a"
                    second shouldBe "b"
                    third shouldBe "c"
                    fourth shouldBe "d"
                    fifth shouldBe "e"
                    sixth shouldBe "f"
                    seventh shouldBe "g"
                    true
                } shouldBe true
            }

            "not call the block w/ a new tuple" {

                (Sep("a", "b", "c", "d", "e", "f", null).letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", "c", "d", "e", null, "g").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", "c", "d", null, "f", "g").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", "c", null, "e", "f", "g").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep("a", "b", null, "d", "e", "f", "g").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep("a", null, "c", "d", "e", "f", "g").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep(null, "b", "c", "d", "e", "f", "g").letNotNull { _ -> true }
                        ?: false) shouldBe false
                (Sep(null, null, null, null, null, null, null).letNotNull { _ -> true }
                        ?: false) shouldBe false
            }
        }
    }
}
