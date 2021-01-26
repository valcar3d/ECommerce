package com.dimensiva.ecommerce.utils

import com.dimensiva.ecommerce.models.Item

object DummyData {
    fun getItems(): MutableList<Item> {
        return mutableListOf(
            Item(
                "https://i5.walmartimages.com/asr/34892510-daac-48d6-b715-7e27988acbc8.d534e57907197211a2787c9372598e25.jpeg?odnHeight=200&odnWidth=200&odnBg=ffffff",
                13,
                1.5,
                "1",
                "Something1"
            ),
            Item(
                "https://i5.walmartimages.com/asr/34892510-daac-48d6-b715-7e27988acbc8.d534e57907197211a2787c9372598e25.jpeg?odnHeight=200&odnWidth=200&odnBg=ffffff",
                13,
                1.5,
                "1",
                "Something2"
            ),
            Item(
                "https://i5.walmartimages.com/asr/34892510-daac-48d6-b715-7e27988acbc8.d534e57907197211a2787c9372598e25.jpeg?odnHeight=200&odnWidth=200&odnBg=ffffff",
                13,
                1.5,
                "1",
                "Something3"
            )
        )
    }
}