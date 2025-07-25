package ar.mad.sumeriosmobile.domain.usecase

import ar.mad.sumeriosmobile.helpers.ServerRetrofit
import javax.inject.Inject

class GetServerStatus @Inject constructor(
    private val serverApi: ServerRetrofit
) {
    suspend operator fun invoke(): String? {
        return serverApi.getServerStatus()
    }
}