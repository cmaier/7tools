@file:Suppress("unused", "UNCHECKED_CAST")

package me.sieben.seventools.functions

import me.sieben.seventools.containers.Hexa
import me.sieben.seventools.containers.Quad
import me.sieben.seventools.containers.Quin
import me.sieben.seventools.containers.Sep

fun <A, B, R> Pair<A?, B?>.letNotNull(block: (A, B) -> R): R? = when (null) {
    first, second -> null
    else -> block(first as A, second as B)
}

fun <A, B, C, R> Triple<A?, B?, C?>.letNotNull(block: (A, B, C) -> R): R? = when (null) {
    first, second, third -> null
    else -> block(first as A, second as B, third as C)
}

fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.letNotNull(block: (A, B, C, D) -> R): R? = when (null) {
    first, second, third, fourth -> null
    else -> block(first, second, third, fourth)
}

fun <A, B, C, D, E, R> Quin<A?, B?, C?, D?, E?>.letNotNull(block: (A, B, C, D, E) -> R): R? = when (null) {
    first, second, third, fourth, fifth -> null
    else -> block(first, second, third, fourth, fifth)
}

fun <A, B, C, D, E, F, R> Hexa<A?, B?, C?, D?, E?, F?>.letNotNull(block: (A, B, C, D, E, F) -> R): R? = when (null) {
    first, second, third, fourth, fifth, sixth -> null
    else -> block(first, second, third, fourth, fifth, sixth)
}

fun <A, B, C, D, E, F, G, R> Sep<A?, B?, C?, D?, E?, F?, G?>.letNotNull(block: (A, B, C, D, E, F, G) -> R): R? = when (null) {
    first, second, third, fourth, fifth, sixth, seventh -> null
    else -> block(first, second, third, fourth, fifth, sixth, seventh)
}