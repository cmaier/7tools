@file:JvmName("VersionSupport")
@file:Suppress("unused")

package me.sieben.seventools.utils

import android.os.Build

fun isAtLeast28Pie() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P

inline fun isAtLeast28Pie(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast28Pie()) supported() else unsupported?.invoke()

fun isAtLeast27OreoMR1() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1

inline fun isAtLeast27OreoMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast27OreoMR1()) supported() else unsupported?.invoke()

fun isAtLeast26Oreo() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

inline fun isAtLeast26Oreo(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast26Oreo()) supported() else unsupported?.invoke()

fun isAtLeast25NougatMR1() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1

inline fun isAtLeast25NougatMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast25NougatMR1()) supported() else unsupported?.invoke()

fun isAtLeast24Nougat() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

inline fun isAtLeast24Nougat(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast24Nougat()) supported() else unsupported?.invoke()

fun isAtLeast23Marshmallow() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

inline fun isAtLeast23Marshmallow(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast23Marshmallow()) supported() else unsupported?.invoke()

fun isAtLeast22LollipopMR1() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1

inline fun isAtLeast22LollipopMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast22LollipopMR1()) supported() else unsupported?.invoke()

fun isAtLeast21Lollipop() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP

inline fun isAtLeast21Lollipop(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast21Lollipop()) supported() else unsupported?.invoke()

fun isAtLeast19KitKat() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT

inline fun isAtLeast19KitKat(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast19KitKat()) supported() else unsupported?.invoke()

fun isAtLeast18JellyBeanMR2() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2

inline fun isAtLeast18JellyBeanMR2(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast18JellyBeanMR2()) supported() else unsupported?.invoke()

fun isAtLeast17JellyBeanMR1() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1

inline fun isAtLeast17JellyBeanMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast17JellyBeanMR1()) supported() else unsupported?.invoke()

fun isAtLeast16JellyBean() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN

inline fun isAtLeast16JellyBean(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast16JellyBean()) supported() else unsupported?.invoke()

@JvmOverloads
fun isAtLeast(sdkVersion: Int, buildVersion: Int = Build.VERSION.SDK_INT) = sdkVersion <= buildVersion
