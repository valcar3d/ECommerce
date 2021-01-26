package com.dimensiva.ecommerce.network

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthenticator(userName: String, password: String): Interceptor {

    private var credentials: String = Credentials.basic(userName, password)

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        request = request.newBuilder().header("Authorization", credentials).build()
        return chain.proceed(request)
    }
}