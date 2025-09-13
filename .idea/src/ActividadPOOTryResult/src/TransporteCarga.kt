abstract class TransporteCarga(
    val patente: String,
    val peso: Double,
    val capacidad: Double
) {
    abstract fun calcularCosto(): Double

    open fun mostrarInfo() {
        println("Patente: $patente | Peso: $peso | Capacidad: $capacidad")
    }
}
