package com.kylexu.buildm.kotlin

class TextBuilder() : Builder() {
    private val buffer = StringBuffer()

    override fun makeTitle(text: String) {
        buffer.append("===================\n")
        buffer.append("[$text]\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("➣$str\n")
        buffer.append("\n")
    }

    override fun makeItems(items: Array<String>) {
        for (item in items) {
            buffer.append("   $item\n")
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("===================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}