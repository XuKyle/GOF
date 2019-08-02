package com.kylexu.buildm.kotlin

abstract class Builder {
    abstract fun makeTitle(text: String)
    abstract fun makeString(str: String)
    abstract fun makeItems(items: Array<String>)
    abstract fun close()
}