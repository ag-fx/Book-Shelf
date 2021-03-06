package com.example.demo.model

import javafx.beans.property.StringProperty
import tornadofx.*

interface BasketItem {
    val title: String
    val author: String
    val genre: String
    val envelopePath: String
    val publisher: String
    val year: Int
    var currencyPrice: StringProperty
    fun calcPrice(): Double
}

open class BasketItemModel: ItemViewModel<BasketItem>() {
    val title = bind { item?.title?.toProperty() }
    val author = bind { item?.author?.toProperty() }
    var genre = bind { item?.genre?.toProperty() }
    var price =  bind { item?.currencyPrice }
    val year = bind { item?.year?.toProperty() }
    val publisher = bind { item?.publisher?.toProperty() }
    var envelopePath = bind { item?.envelopePath?.toProperty() }
}