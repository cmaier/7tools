package me.sieben.seventools.xtensions

import android.content.res.Resources
import android.util.TypedValue

fun Int.dpToPx() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this.toFloat(), Resources.getSystem().displayMetrics).toInt()

fun Int.spToPx() = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, this.toFloat(), Resources.getSystem().displayMetrics).toInt()

fun Int.pxToDp() = (this / Resources.getSystem().displayMetrics.density + .5).toInt()