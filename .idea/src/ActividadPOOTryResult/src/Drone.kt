class Drone(patente: String, peso: Double, capacidad: Double) :
    TransporteCarga(patente, peso, capacidad) {

    override fun calcularCosto(): Double {
        return peso * 20 + 500
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Tipo: Drone | Costo de envío: ${calcularCosto()}")
    }
}
