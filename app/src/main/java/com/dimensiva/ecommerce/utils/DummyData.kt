package com.dimensiva.ecommerce.utils

import com.dimensiva.ecommerce.models.Item

object DummyData {
    fun getItems(): MutableList<Item> {
        return mutableListOf(
            Item(
                "https://simpleicon.com/wp-content/uploads/rocket.png",
                13,
                1.5,
                "1",
                "Something1"
            ),
            Item(
                "https://simpleicon.com/wp-content/uploads/rocket.png",
                13,
                1.5,
                "1",
                "Something2"
            ),
            Item(
                "https://simpleicon.com/wp-content/uploads/rocket.png",
                13,
                1.5,
                "1",
                "Something3"
            )
        )
    }
}