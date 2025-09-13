import autenticacion.Usuario
import autenticacion.Autenticacion

fun main() {
    println("=== Sistema de Login ===")

    print("Ingrese su nombre de usuario: ")
    val nombre = readLine() ?: ""

    print("Ingrese su contraseña: ")
    val clave = readLine() ?: ""

    val usuario = Usuario("Antonella", "1234") // Usuario registrado en el sistema
    val auth = Autenticacion()

    if (auth.login(usuario, clave) && usuario.nombre == nombre) {
        println("✅ Bienvenido ${usuario.nombre}")
    } else {
        println("Usuario o contraseña incorrectos")
    }
}
