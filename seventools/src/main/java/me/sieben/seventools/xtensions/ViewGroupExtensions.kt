@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.support.annotation.LayoutRes
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, parent: ViewGroup? = this, attachToRoot: Boolean = false): View =
        context.layoutInflater.inflate(layoutRes, parent, attachToRoot)

fun ViewGroup.getChildren() = mutableListOf<View>().apply { (0 until childCount).forEach { add(getChildAt(it)) } }.toList()