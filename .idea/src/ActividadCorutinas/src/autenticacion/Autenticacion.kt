package autenticacion

class Autenticacion {
    fun login(usuario: Usuario, claveIngresada: String): Boolean {
        return usuario.clave == claveIngresada
    }
}
