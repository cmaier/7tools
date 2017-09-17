@file:Suppress("unused")

package me.sieben.seventools.containers

import java.io.Serializable

data class Quad<out A, out B, out C, out D>(val first: A,
                                            val second: B,
                                            val third: C,
                                            val fourth: D) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth)"
}

fun <T> Quad<T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth)

data class Quin<out A, out B, out C, out D, out E>(val first: A,
                                                   val second: B,
                                                   val third: C,
                                                   val fourth: D,
                                                   val fifth: E) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth)"
}

fun <T> Quin<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)

data class Hexa<out A, out B, out C, out D, out E, out F>(val first: A,
                                                          val second: B,
                                                          val third: C,
                                                          val fourth: D,
                                                          val fifth: E,
                                                          val sixth: F) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

fun <T> Hexa<T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth)

data class Sep<out A, out B, out C, out D, out E, out F, out G>(val first: A,
                                                                val second: B,
                                                                val third: C,
                                                                val fourth: D,
                                                                val fifth: E,
                                                                val sixth: F,
                                                                val seventh: G) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"
}

fun <T> Sep<T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh)