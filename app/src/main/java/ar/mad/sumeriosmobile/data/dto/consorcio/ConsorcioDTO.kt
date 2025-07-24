package ar.mad.sumeriosmobile.data.dto.consorcio

import ar.mad.sumeriosmobile.data.dto.consorcioEstadoCuenta.EstadoCuentaConsorcioDTO
import ar.mad.sumeriosmobile.data.dto.enum.TipoCuenta
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
)