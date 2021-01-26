package com.dimensiva.ecommerce.network

import com.dimensiva.ecommerce.models.ItemsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface RestApi {

    @GET("search")
    fun searchProduct(@Query("product") product: String): Call<ItemsResponse>

}