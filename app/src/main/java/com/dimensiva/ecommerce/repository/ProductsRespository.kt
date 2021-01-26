package com.dimensiva.ecommerce.repository

import com.dimensiva.ecommerce.interfaces.RetrofitCallback
import com.dimensiva.ecommerce.network.RestApiService

class ProductsRespository {
    lateinit var restApiService: RestApiService

    fun searchProduct(productToSearch: String, retrofitCallback: RetrofitCallback){
        restApiService = RestApiService()
        restApiService.searchProduct(productToSearch, retrofitCallback)
    }


}