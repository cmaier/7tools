@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.app.Activity
import android.content.Context
import android.support.annotation.StringRes
import android.widget.Toast

fun Activity.toast(message: CharSequence?, duration: Int = Toast.LENGTH_LONG) {
    (this as Context).toast(message, duration)
}

fun Activity.toast(@StringRes stringRes: Int, duration: Int = Toast.LENGTH_LONG) {
    (this as Context).toast(stringRes, duration)
}

fun Activity.shortToast(message: CharSequence?) {
    (this as Context).shortToast(message)
}

fun Activity.shortToast(@StringRes stringRes: Int) {
    (this as Context).shortToast(stringRes)
}