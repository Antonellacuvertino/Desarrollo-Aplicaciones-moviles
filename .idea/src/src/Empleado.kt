class Empleado(
    nombre: String,
    edad: Int,
    val puesto: String,
    private val salario: Double
) : Persona(nombre, edad) {

    fun mostrarPuesto() {
        println("$nombre trabaja como $puesto.")
    }

    override fun presentarse() {
        println("Hola, soy $nombre y mi puesto es $puesto.")
    }
}
