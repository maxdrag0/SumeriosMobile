package ar.mad.sumeriosmobile.data.dto.consorcio

import ar.mad.sumeriosmobile.domain.model.ConsorcioDomain
import kotlinx.serialization.Serializable


@Serializable
data class ConsorcioDTO(
    var idConsorcio: Long,
    var nombre: String,
    var direccion: String,
    var ciudad: String,
//    var banco: String,
//    var cuit: String,
//    var titularCuenta: String,
//    var tipoCuenta: TipoCuenta,
//    var cbu: String,
//    var numCuenta: String,
//    var alias: String,
//    var porcentajeIntereses: Double,
//    var segundoVencimiento: Boolean,
//    var porcentajeSegundoVencimiento: Double,
//    var estadoCuentaConsorcioDTO: EstadoCuentaConsorcioDTO,
//    var idAdm: Long,
) {
    fun toDomain() = ConsorcioDomain(
        id = idConsorcio,
        nombre = nombre,
        direccion = direccion,
        ciudad = ciudad
    )
}