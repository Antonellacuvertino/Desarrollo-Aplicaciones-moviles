class Camioneta(patente: String, peso: Double, capacidad: Double) :
    TransporteCarga(patente, peso, capacidad) {

    override fun calcularCosto(): Double {
        return peso * 50 + 200
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Tipo: Camioneta | Costo de envío: ${calcularCosto()}")
    }
}
