package com.kylexu.factorymethod.kotlin.idcard

import com.kylexu.factorymethod.kotlin.framework.Product

class IDCard(private val owner: String) : Product() {

    init {
        println("making $owner's card ...")
    }

    override fun use() {
        println("using $owner' card!")
    }

    fun getOwner(): String {
        return owner
    }

}