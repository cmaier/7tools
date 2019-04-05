@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

fun Fragment.toast(message: CharSequence?, duration: Int = Toast.LENGTH_LONG) {
    context?.toast(message, duration)
}

fun Fragment.toast(@StringRes stringRes: Int, duration: Int = Toast.LENGTH_LONG) {
    context?.toast(stringRes, duration)
}

fun Fragment.shortToast(message: CharSequence?) {
    context?.shortToast(message)
}

fun Fragment.shortToast(@StringRes stringRes: Int) {
    context?.shortToast(stringRes)
}