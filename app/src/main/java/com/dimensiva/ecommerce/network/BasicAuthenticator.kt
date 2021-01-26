package com.dimensiva.ecommerce.network

import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthenticator : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
            .newBuilder()
            .addHeader(Constants.CLIENT_ID, Constants.API_KEY)
            .build()
        return chain.proceed(request)
    }
}