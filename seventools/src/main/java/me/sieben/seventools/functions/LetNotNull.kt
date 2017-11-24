@file:Suppress("unused", "UNCHECKED_CAST")

package me.sieben.seventools.functions

import me.sieben.seventools.containers.Hex
import me.sieben.seventools.containers.Quad
import me.sieben.seventools.containers.Quin
import me.sieben.seventools.containers.Sep

fun <A, B, R> Pair<A?, B?>.letNotNull(block: (A, B) -> R): R? = when (null) {
    first, second -> null
    else -> block(first as A, second as B)
}

fun <A, B, R> Pair<A?, B?>.letNotNull(block: (Pair<A, B>) -> R): R? = when (null) {
    first, second -> null
    else -> block(Pair(first as A, second as B))
}

inline fun <A, B, C, R> Triple<A?, B?, C?>.letNotNull(block: (A, B, C) -> R): R? = when (null) {
    first, second, third -> null
    else -> block(first as A, second as B, third as C)
}

fun <A, B, C, R> Triple<A?, B?, C?>.letNotNull(block: (Triple<A, B, C>) -> R): R? = when (null) {
    first, second, third -> null
    else -> block(Triple(first as A, second as B, third as C))
}

fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.letNotNull(block: (A, B, C, D) -> R): R? = when (null) {
    first, second, third, fourth -> null
    else -> block(first, second, third, fourth)
}

fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.letNotNull(block: (Quad<A, B, C, D>) -> R): R? = when (null) {
    first, second, third, fourth -> null
    else -> block(Quad(first, second, third, fourth))
}

fun <A, B, C, D, E, R> Quin<A?, B?, C?, D?, E?>.letNotNull(block: (A, B, C, D, E) -> R): R? = when (null) {
    first, second, third, fourth, fifth -> null
    else -> block(first, second, third, fourth, fifth)
}

fun <A, B, C, D, E, R> Quin<A?, B?, C?, D?, E?>.letNotNull(block: (Quin<A, B, C, D, E>) -> R): R? = when (null) {
    first, second, third, fourth, fifth -> null
    else -> block(Quin(first, second, third, fourth, fifth))
}

fun <A, B, C, D, E, F, R> Hex<A?, B?, C?, D?, E?, F?>.letNotNull(block: (A, B, C, D, E, F) -> R): R? = when (null) {
    first, second, third, fourth, fifth, sixth -> null
    else -> block(first, second, third, fourth, fifth, sixth)
}

fun <A, B, C, D, E, F, R> Hex<A?, B?, C?, D?, E?, F?>.letNotNull(block: (Hex<A, B, C, D, E, F>) -> R): R? = when (null) {
    first, second, third, fourth, fifth, sixth -> null
    else -> block(Hex(first, second, third, fourth, fifth, sixth))
}

fun <A, B, C, D, E, F, G, R> Sep<A?, B?, C?, D?, E?, F?, G?>.letNotNull(block: (A, B, C, D, E, F, G) -> R): R? = when (null) {
    first, second, third, fourth, fifth, sixth, seventh -> null
    else -> block(first, second, third, fourth, fifth, sixth, seventh)
}

fun <A, B, C, D, E, F, G, R> Sep<A?, B?, C?, D?, E?, F?, G?>.letNotNull(block: (Sep<A, B, C, D, E, F, G>) -> R): R? = when (null) {
    first, second, third, fourth, fifth, sixth, seventh -> null
    else -> block(Sep(first, second, third, fourth, fifth, sixth, seventh))
}