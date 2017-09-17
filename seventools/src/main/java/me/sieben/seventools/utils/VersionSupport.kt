@file:JvmName("VersionSupport")
@file:Suppress("unused")

package me.sieben.seventools.utils

import android.os.Build

fun isAtLeast26Oreo() = Build.VERSION_CODES.O.isSupported()

fun isAtLeast25NougatMR1() = Build.VERSION_CODES.N_MR1.isSupported()

fun isAtLeast24Nougat() = Build.VERSION_CODES.N.isSupported()

fun isAtLeast23Marshmallow() = Build.VERSION_CODES.M.isSupported()

fun isAtLeast22LollipopMR1() = Build.VERSION_CODES.LOLLIPOP_MR1.isSupported()

fun isAtLeast21Lollipop() = Build.VERSION_CODES.LOLLIPOP.isSupported()

fun isAtLeast19KitKat() = Build.VERSION_CODES.KITKAT.isSupported()

fun isAtLeast18JellyBeanMR2() = Build.VERSION_CODES.JELLY_BEAN_MR2.isSupported()

fun isAtLeast17JellyBeanMR1() = Build.VERSION_CODES.JELLY_BEAN_MR1.isSupported()

fun isAtLeast16JellyBean() = Build.VERSION_CODES.JELLY_BEAN.isSupported()

private fun Int.isSupported(buildVersion: Int = Build.VERSION.SDK_INT) = isAtLeast(this, buildVersion)

@JvmOverloads
fun isAtLeast(sdkVersion: Int, buildVersion: Int = Build.VERSION.SDK_INT) = sdkVersion <= buildVersion

