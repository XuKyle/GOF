package com.kylexu.buildm.kotlin

import kotlin.system.exitProcess

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        if (args.size != 1) {
            usage()
            exitProcess(status = 0)
        }

        when (args.get(0)) {
            "plain" -> {
                val textBuilder = TextBuilder()
                val director = Director(textBuilder)
                director.construct()
                val result = textBuilder.getResult()
                println(result)
            }
            "html" -> {
                val htmlBuilder = HtmlBuilder()
                val director = Director(htmlBuilder)
                director.construct()
                val fileName = htmlBuilder.getResult()
                println("$fileName 文件编写完成")
            }
            else -> {
                usage()
                exitProcess(0)
            }
        }
    }

    private fun usage() {
        println("Usage:java Main plain 编写纯文本")
        println("Usage:java Main html 编写HTML文档")
    }
}