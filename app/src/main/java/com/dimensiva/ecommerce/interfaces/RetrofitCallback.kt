package com.dimensiva.ecommerce.interfaces

import com.dimensiva.ecommerce.models.ItemResponse

interface RetrofitCallback {
    fun onProductSearch(product: ItemResponse)
    fun onError(error: String)
}