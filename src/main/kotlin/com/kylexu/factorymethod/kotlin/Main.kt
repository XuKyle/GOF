package com.kylexu.factorymethod.kotlin

import com.kylexu.factorymethod.kotlin.idcard.IDFactory

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val factory = IDFactory()
        val kyle = factory.create("kyle")
        val a = factory.create("a")
        val b = factory.create("b")

        kyle.use()
        a.use()
        b.use()

        // factory.getAllIds().forEach { println(it) }
    }
}