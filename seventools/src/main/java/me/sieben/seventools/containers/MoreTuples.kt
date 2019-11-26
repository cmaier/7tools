@file:Suppress("unused")

package me.sieben.seventools.containers

import java.io.Serializable

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
data class Quad<out A, out B, out C, out D>(val first: A,
                                            val second: B,
                                            val third: C,
                                            val fourth: D) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth)"
}

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
fun <T> Quad<T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth)

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
data class Quin<out A, out B, out C, out D, out E>(val first: A,
                                                   val second: B,
                                                   val third: C,
                                                   val fourth: D,
                                                   val fifth: E) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth)"
}

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
fun <T> Quin<T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth)

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
data class Hex<out A, out B, out C, out D, out E, out F>(val first: A,
                                                         val second: B,
                                                         val third: C,
                                                         val fourth: D,
                                                         val fifth: E,
                                                         val sixth: F) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth)"
}

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
fun <T> Hex<T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth)

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
data class Sep<out A, out B, out C, out D, out E, out F, out G>(val first: A,
                                                                val second: B,
                                                                val third: C,
                                                                val fourth: D,
                                                                val fifth: E,
                                                                val sixth: F,
                                                                val seventh: G) : Serializable {

    override fun toString() = "($first, $second, $third, $fourth, $fifth, $sixth, $seventh)"
}

@Deprecated("This n-tuples only existed for nTuple.letNotNull() which has been deprecated.", ReplaceWith(""))
fun <T> Sep<T, T, T, T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth, fifth, sixth, seventh)
