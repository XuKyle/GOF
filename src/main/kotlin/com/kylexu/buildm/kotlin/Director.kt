package com.kylexu.buildm.kotlin

class Director(val builder: Builder) {

    fun construct() {
        builder.makeTitle("Greeting")

        builder.makeString("从早上至下午")

        val arrayOf = arrayOf(
                "早上好",
                "下午好"
        )
        builder.makeItems(arrayOf)

        builder.makeString("晚上")
        builder.makeItems(arrayOf(
                "晚上好",
                "晚安",
                "再见"
        ))

        builder.close()
    }

}