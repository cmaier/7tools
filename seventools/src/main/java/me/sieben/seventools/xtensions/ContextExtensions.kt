@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.*
import androidx.core.content.ContextCompat

@ColorInt
fun Context.color(@ColorRes colorRes: Int) = ContextCompat.getColor(this, colorRes)

fun Context.drawable(@DrawableRes drawableRes: Int): Drawable? = ContextCompat.getDrawable(this, drawableRes)

fun Context.dimensionPixelSize(@DimenRes dimenRes: Int) = resources.getDimensionPixelSize(dimenRes)

fun Context.toast(message: CharSequence?, duration: Int = Toast.LENGTH_LONG) = message?.let { Toast.makeText(this, it, duration).show() }

fun Context.toast(@StringRes stringRes: Int, duration: Int = Toast.LENGTH_LONG) = Toast.makeText(this, stringRes, duration).show()

fun Context.shortToast(message: CharSequence?) = this.toast(message, Toast.LENGTH_SHORT)

fun Context.shortToast(@StringRes stringRes: Int) = this.toast(stringRes, Toast.LENGTH_SHORT)

val Context.layoutInflater: LayoutInflater get() = LayoutInflater.from(this)