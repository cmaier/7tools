package me.sieben.seventools.functions

import android.graphics.Color
import androidx.annotation.ColorInt
import kotlin.math.roundToInt

@ColorInt
fun Int.newWithAlpha(percentage: Float): Int = Color.argb(
        kotlin.math.round(255 * percentage).roundToInt(),
        Color.red(this),
        Color.green(this),
        Color.blue(this)
)