package com.dimensiva.ecommerce.interfaces

import com.dimensiva.ecommerce.models.ItemsResponse

interface RetrofitCallback {
    fun onProductSearch(product: ItemsResponse)
    fun onError(error: String)
}