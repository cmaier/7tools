@file:Suppress("unused")

package me.sieben.seventools.utils

import android.util.Log

@Deprecated("For development only!", ReplaceWith("this"))
fun <T> T.io(msg: String = "", tag: String = "logIo", throwable: Throwable? = null): T = apply {
    Log.d(tag, "$msg <$this>", throwable)
}

fun <T> T.verb(msg: String = "", tag: String = "logVerbose", throwable: Throwable? = this as? Throwable): T = apply {
    Log.v(tag, "$msg <$this>", throwable)
}

fun <T> T.dbg(msg: String = "", tag: String = "logDebug", throwable: Throwable? = this as? Throwable): T = apply {
    Log.d(tag, "$msg <$this>", throwable)
}

fun <T> T.info(msg: String = "", tag: String = "logInfo", throwable: Throwable? = this as? Throwable): T = apply {
    Log.i(tag, "$msg <$this>", throwable)
}

fun <T> T.warn(msg: String = "", tag: String = "logWarn", throwable: Throwable? = this as? Throwable): T = apply {
    Log.w(tag, "$msg <$this>", throwable)
}

fun <T> T.err(msg: String = "", tag: String = "logError", throwable: Throwable? = this as? Throwable): T = apply {
    Log.e(tag, "$msg <$this>", throwable)
}

fun <T> T.wtf(msg: String = "", tag: String = "logWtf", throwable: Throwable? = this as? Throwable): T = apply {
    Log.wtf(tag, "$msg <$this>", throwable)
}
