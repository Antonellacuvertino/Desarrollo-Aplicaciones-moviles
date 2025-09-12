open class Persona(
    val nombre: String,
    val edad: Int
) {
    open fun presentarse() {
        println("Hola, mi nombre es $nombre.")
    }
}
