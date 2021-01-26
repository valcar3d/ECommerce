package com.dimensiva.ecommerce.network

import com.dimensiva.ecommerce.interfaces.RetrofitCallback
import com.dimensiva.ecommerce.models.ItemResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {

    fun searchProduct(productToSeach: String, retrofitCallback: RetrofitCallback) {

        val retrofit = ServiceBuilder.buildService(RestApi::class.java)

        retrofit.searchProduct(productToSeach).enqueue(object : Callback<ItemResponse> {
            override fun onResponse(call: Call<ItemResponse>, response: Response<ItemResponse>) {
                if (response.body() != null) {
                    retrofitCallback.onProductSearch(response.body()!!)
                } else {
                    retrofitCallback.onError("Error de respuesta de servidor")
                }
            }

            override fun onFailure(call: Call<ItemResponse>, t: Throwable) {
                retrofitCallback.onError(t.message!!)
            }

        })

    }
}