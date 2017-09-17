@file:Suppress("unused")

package me.sieben.seventools.xtensions

import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import java.net.URLDecoder
import java.net.URLEncoder

fun String?.emptyToNull() = if (this?.isEmpty() != false) null else this

fun String?.nullToEmpty() = this ?: ""

fun String?.strikeThrough() = this?.let { SpannableString(it).apply { setSpan(StrikethroughSpan(), 0, it.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE) } }

fun String.urlEncode(): String = URLEncoder.encode(this, Charsets.UTF_8.name())

fun String.urlDecode(): String = URLDecoder.decode(this, Charsets.UTF_8.name())