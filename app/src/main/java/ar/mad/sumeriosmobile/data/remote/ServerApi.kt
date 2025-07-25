package ar.mad.sumeriosmobile.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface ServerApi {
    @GET("auth/status")
    suspend fun getStatus(): Response<String?>
}