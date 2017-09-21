@file:Suppress("unused")

package me.sieben.seventools.functions

import me.sieben.seventools.containers.Hex
import me.sieben.seventools.containers.Quad
import me.sieben.seventools.containers.Quin
import me.sieben.seventools.containers.Sep

fun <A, B, R> Pair<A?, B?>.let(block: (A?, B?) -> R): R? =
        block(first, second)

fun <A, B, C, R> Triple<A?, B?, C?>.let(block: (A?, B?, C?) -> R): R? =
        block(first, second, third)


fun <A, B, C, D, R> Quad<A?, B?, C?, D?>.let(block: (A?, B?, C?, D?) -> R): R? =
        block(first, second, third, fourth)


fun <A, B, C, D, E, R> Quin<A?, B?, C?, D?, E?>.let(block: (A?, B?, C?, D?, E?) -> R): R? =
        block(first, second, third, fourth, fifth)


fun <A, B, C, D, E, F, R> Hex<A?, B?, C?, D?, E?, F?>.let(block: (A?, B?, C?, D?, E?, F?) -> R): R? =
        block(first, second, third, fourth, fifth, sixth)


fun <A, B, C, D, E, F, G, R> Sep<A?, B?, C?, D?, E?, F?, G?>.let(block: (A?, B?, C?, D?, E?, F?, G?) -> R): R? =
        block(first, second, third, fourth, fifth, sixth, seventh)
