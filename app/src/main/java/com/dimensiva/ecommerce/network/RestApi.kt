package com.dimensiva.ecommerce.network

import com.dimensiva.ecommerce.models.ItemResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Query

interface RestApi {
    @GET(Constants.BASE_URL)
    fun searchProduct(@Query("product") product: String): Call<ItemResponse>}