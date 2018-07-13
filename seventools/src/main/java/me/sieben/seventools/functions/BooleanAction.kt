package me.sieben.seventools.functions

inline infix fun Boolean?.onTrue(action: () -> Unit): Boolean? {
    if (this != null && this) action()
    return this
}

inline infix fun Boolean?.onFalse(action: () -> Unit): Boolean? {
    if (this != null && !this) action()
    return this
}

inline infix fun Boolean?.onNull(action: () -> Unit): Boolean? {
    if (this == null) action()
    return this
}