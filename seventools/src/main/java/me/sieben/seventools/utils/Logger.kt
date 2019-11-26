@file:Suppress("unused")

package me.sieben.seventools.utils

import android.util.Log

@Deprecated("For development only!", ReplaceWith("this"))
fun <T> T.io(msg: String = "", tag: String = "logIo"): T = apply {
    Log.d(tag, "$msg <$this>")
}

fun <T> T.verb(msg: String = "", tag: String = "logVerbose"): T = apply {
    Log.v(tag, "$msg <$this>")
}

fun <T> T.dbg(msg: String = "", tag: String = "logDebug"): T = apply {
    Log.d(tag, "$msg <$this>")
}

fun <T> T.warn(msg: String = "", tag: String = "logWarn"): T = apply {
    Log.w(tag, "$msg <$this>")
}

fun <T> T.err(msg: String = "", tag: String = "logError"): T = apply {
    Log.e(tag, "$msg <$this>")
}

fun <T> T.wtf(msg: String = "", tag: String = "logWtf"): T = apply {
    Log.wtf(tag, "$msg <$this>")
}

fun <T> T.wtf(throwable: Throwable, tag: String = "logWtf"): T = apply {
    Log.wtf(tag, "<$this>", throwable)
}

fun <T> T.wtf(msg: String = "", throwable: Throwable, tag: String = "logWtf"): T = apply {
    Log.wtf(tag, "$msg <$this>", throwable)
}
