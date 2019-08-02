package com.kylexu.buildm.kotlin

import java.io.FileWriter
import java.io.PrintWriter

class HtmlBuilder() : Builder() {
    private var fileName: String = ""
    private var writer: PrintWriter? = null

    override fun makeTitle(text: String) {
        fileName = "$text\\.html"
        writer = PrintWriter(FileWriter(fileName))
        writer?.println("<html><head><title>$text</title></head><body>")
        writer?.println("<h1>$text</h1>")
    }

    override fun makeString(str: String) {
        writer?.println("<p>$str</p>")
    }

    override fun makeItems(items: Array<String>) {
        writer?.println("<ul>")
        for (item in items) {
            writer?.println("<li>$item</li>")
        }
        writer?.println("</ul>")
    }

    override fun close() {
        writer?.println("</body></html>")
    }

    fun getResult(): String {
        return fileName
    }
}