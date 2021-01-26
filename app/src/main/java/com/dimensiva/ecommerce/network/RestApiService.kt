package com.dimensiva.ecommerce.network

import com.dimensiva.ecommerce.interfaces.RetrofitCallback
import com.dimensiva.ecommerce.models.ItemsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {

    fun searchProduct(productToSearch: String, retrofitCallback: RetrofitCallback) {

        val retrofit = ServiceBuilder.buildService(RestApi::class.java)

        retrofit.searchProduct(productToSearch).enqueue(object : Callback<ItemsResponse> {
            override fun onResponse(call: Call<ItemsResponse>, response: Response<ItemsResponse>) {
                if (response.body() != null) {
                    retrofitCallback.onProductSearch(response.body()!!)
                } else {
                    retrofitCallback.onError("Error de respuesta de servidor")
                }
            }

            override fun onFailure(call: Call<ItemsResponse>, t: Throwable) {
                retrofitCallback.onError(t.message!!)
            }

        })

    }
}