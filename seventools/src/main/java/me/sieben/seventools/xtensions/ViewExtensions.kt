@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.graphics.Rect
import android.view.View

fun View.locationOnScreen() = IntArray(2).apply { getLocationOnScreen(this) }

fun View.locationInWindow() = IntArray(2).apply { getLocationInWindow(this) }

fun View.hitRect() = Rect().apply { getHitRect(this) }

fun View.setVisible() {
    visibility = View.VISIBLE
}

fun View.setGone(isVisible: Boolean = false) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun View.setInvisible(isVisible: Boolean = false) {
    visibility = if (isVisible) View.VISIBLE else View.INVISIBLE
}

fun View.runAfterMeasurement(block: (w: Int, h: Int) -> Unit) = post { block(width, height) }

fun View.postDelay(delayInMillis: Long, block: () -> Unit) = postDelayed(block, delayInMillis)

fun View.setPadding(sizeInDp: Int) = with(sizeInDp.dpToPx()) {
    setPadding(this, this, this, this)
}