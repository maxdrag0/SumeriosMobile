package ar.mad.sumeriosmobile.core

import okhttp3.Interceptor
import okhttp3.Response

object InterceptorCustom : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val apiKey = "hola"

        var request = chain.request()
        request = request.newBuilder()
            .header("X-Api-Key", apiKey ?: "")
            .header("Accept", "application/json")
            .header("Content-type", "application.json")
            .build()

        return chain.proceed(request)
    }
}