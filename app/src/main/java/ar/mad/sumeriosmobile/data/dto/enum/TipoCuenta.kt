package ar.mad.sumeriosmobile.data.dto.enum

enum class TipoCuenta(val descripcion: String) {
    CUENTA_CORRIENTE("Cuenta corriente"),
    CAJA_AHORRO("Caja de ahorro");

    override fun toString(): String {
        return descripcion
    }
}