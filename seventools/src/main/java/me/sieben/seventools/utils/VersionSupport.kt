@file:JvmName("VersionSupport")
@file:Suppress("unused")

package me.sieben.seventools.utils

import android.os.Build

fun isAtLeast26Oreo() = Build.VERSION_CODES.O.isSupported()

inline fun isAtLeast26Oreo(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast26Oreo()) supported() else unsupported?.invoke()

fun isAtLeast25NougatMR1() = Build.VERSION_CODES.N_MR1.isSupported()

inline fun isAtLeast25NougatMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast25NougatMR1()) supported() else unsupported?.invoke()

fun isAtLeast24Nougat() = Build.VERSION_CODES.N.isSupported()

inline fun isAtLeast24Nougat(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast24Nougat()) supported() else unsupported?.invoke()

fun isAtLeast23Marshmallow() = Build.VERSION_CODES.M.isSupported()

inline fun isAtLeast23Marshmallow(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast23Marshmallow()) supported() else unsupported?.invoke()

fun isAtLeast22LollipopMR1() = Build.VERSION_CODES.LOLLIPOP_MR1.isSupported()

inline fun isAtLeast22LollipopMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast22LollipopMR1()) supported() else unsupported?.invoke()

fun isAtLeast21Lollipop() = Build.VERSION_CODES.LOLLIPOP.isSupported()

inline fun isAtLeast21Lollipop(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast21Lollipop()) supported() else unsupported?.invoke()

fun isAtLeast19KitKat() = Build.VERSION_CODES.KITKAT.isSupported()

inline fun isAtLeast19KitKat(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast19KitKat()) supported() else unsupported?.invoke()

fun isAtLeast18JellyBeanMR2() = Build.VERSION_CODES.JELLY_BEAN_MR2.isSupported()

inline fun isAtLeast18JellyBeanMR2(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast18JellyBeanMR2()) supported() else unsupported?.invoke()

fun isAtLeast17JellyBeanMR1() = Build.VERSION_CODES.JELLY_BEAN_MR1.isSupported()

inline fun isAtLeast17JellyBeanMR1(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast17JellyBeanMR1()) supported() else unsupported?.invoke()

fun isAtLeast16JellyBean() = Build.VERSION_CODES.JELLY_BEAN.isSupported()

inline fun isAtLeast16JellyBean(noinline unsupported: (() -> Unit)? = null, supported: () -> Unit) = if (isAtLeast16JellyBean()) supported() else unsupported?.invoke()

private fun Int.isSupported(buildVersion: Int = Build.VERSION.SDK_INT) = isAtLeast(this, buildVersion)

@JvmOverloads
fun isAtLeast(sdkVersion: Int, buildVersion: Int = Build.VERSION.SDK_INT) = sdkVersion <= buildVersion