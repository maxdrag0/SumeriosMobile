package ar.mad.sumeriosmobile.helpers

import ar.mad.sumeriosmobile.data.remote.ServerApi
import javax.inject.Inject

class ServerRetrofit @Inject constructor
    (private val service: ServerApi) : IServiceServer {

    override suspend fun getServerStatus(): String? {
        val response = service.getStatus()
        return if (response.isSuccessful) {
            response.body()
        } else {
            "Aca no hay nada"
        }
    }
}