@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.widget.TextView

fun TextView.setTextOrHide(text: CharSequence?) {
    setGone(text != null)
    setText(text)
}