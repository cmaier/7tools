package me.sieben.seventools.functions

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec

class BooleanActionTest : WordSpec() {

    init {

        "Boolean.onTrue" should {

            "run the block if the Boolean is true" {
                var checkpoint = false
                true onTrue { checkpoint = true }
                checkpoint shouldBe true
            }

            "do not run the block if the Boolean is false" {
                var checkpoint = false
                false onTrue { checkpoint = true }
                checkpoint shouldBe false
            }

            "do not run the block if the Boolean is null" {
                var checkpoint = false
                null onTrue { checkpoint = true }
                checkpoint shouldBe false
            }

            "only the `true'-Block" {
                var checkpointTrue = false
                var checkpointFalse = false
                var checkpointNull = false
                true onTrue {
                    checkpointTrue = true
                } onFalse {
                    checkpointFalse = true
                } onNull {
                    checkpointNull = true
                }
                checkpointTrue shouldBe true
                checkpointFalse shouldBe false
                checkpointNull shouldBe false
            }
        }

        "Boolean.onFalse" should {

            "run the block if the Boolean is false" {
                var checkpoint = false
                false onFalse { checkpoint = true }
                checkpoint shouldBe true
            }

            "do not run the block if the Boolean is true" {
                var checkpoint = false
                true onFalse { checkpoint = true }
                checkpoint shouldBe false
            }

            "do not run the block if the Boolean is null" {
                var checkpoint = false
                null onFalse { checkpoint = true }
                checkpoint shouldBe false
            }

            "only the `false'-Block" {
                var checkpointTrue = false
                var checkpointFalse = false
                var checkpointNull = false
                false onTrue {
                    checkpointTrue = true
                } onFalse {
                    checkpointFalse = true
                } onNull {
                    checkpointNull = true
                }
                checkpointTrue shouldBe false
                checkpointFalse shouldBe true
                checkpointNull shouldBe false
            }
        }

        "Boolean.onNull" should {

            "run the block if the Boolean is null" {
                var checkpoint = false
                null onNull { checkpoint = true }
                checkpoint shouldBe true
            }

            "do not run the block if the Boolean is true" {
                var checkpoint = false
                true onNull { checkpoint = true }
                checkpoint shouldBe false
            }

            "do not run the block if the Boolean is false" {
                var checkpoint = false
                false onNull { checkpoint = true }
                checkpoint shouldBe false
            }

            "only the `null'-Block" {
                var checkpointTrue = false
                var checkpointFalse = false
                var checkpointNull = false
                null onTrue {
                    checkpointTrue = true
                } onFalse {
                    checkpointFalse = true
                } onNull {
                    checkpointNull = true
                }
                checkpointTrue shouldBe false
                checkpointFalse shouldBe false
                checkpointNull shouldBe true
            }
        }
    }
}