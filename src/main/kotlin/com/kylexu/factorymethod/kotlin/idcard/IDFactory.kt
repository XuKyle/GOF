package com.kylexu.factorymethod.kotlin.idcard

import com.kylexu.factorymethod.kotlin.framework.Factory
import com.kylexu.factorymethod.kotlin.framework.Product

class IDFactory() : Factory() {

    private val owners: MutableList<String> = mutableListOf()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        when (product) {
            is IDCard -> owners.add(product.getOwner())
            else -> throw Exception("factory not support!")
        }
    }

    fun getAllIds(): MutableList<String> {
        return owners
    }
}