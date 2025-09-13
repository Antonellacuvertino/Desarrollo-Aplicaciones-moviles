class Camion(patente: String, peso: Double, capacidad: Double) :
    TransporteCarga(patente, peso, capacidad) {

    override fun calcularCosto(): Double {
        return peso * 100 // simulamos el costp
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Tipo: Camión | Costo de envío: ${calcularCosto()}")
    }
}
