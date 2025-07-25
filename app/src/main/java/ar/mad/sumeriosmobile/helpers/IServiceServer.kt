package ar.mad.sumeriosmobile.helpers

interface IServiceServer {
    suspend fun getServerStatus(): String?
}
