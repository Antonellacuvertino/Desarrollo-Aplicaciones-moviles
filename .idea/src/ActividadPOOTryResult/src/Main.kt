fun crearTransporte(
    tipo: String,
    patente: String,
    peso: Double,
    capacidad: Double
): Result<TransporteCarga> {
    return try {
        if (patente.isBlank()) {
            return Result.failure(Exception("Error: La patente no puede estar vacía."))
        }
        if (peso > capacidad) {
            return Result.failure(Exception("Error: El peso ($peso) excede la capacidad ($capacidad)."))
        }

        val transporte: TransporteCarga = when (tipo.lowercase()) {
            "camion" -> Camion(patente, peso, capacidad)
            "camioneta" -> Camioneta(patente, peso, capacidad)
            "drone" -> Drone(patente, peso, capacidad)
            else -> throw IllegalArgumentException(" Tipo de transporte inválido: $tipo")
        }

        Result.success(transporte)
    } catch (e: Exception) {
        Result.failure(e)
    }
}

fun main() {
    println("=== Registro de Vehículos de Carga ===")

    // Vehículo 1
    val registro1 = crearTransporte("Camion", "AABB73", 5000.0, 7000.0)
    registro1.onSuccess {
        println(" Registro exitoso:")
        it.mostrarInfo()
    }.onFailure {
        println(it.message)
    }

    println("----------------------------------")

    // Vehículo 2
    val registro2 = crearTransporte("Drone", "DR1129", 150.0, 100.0)
    registro2.onSuccess {
        println("✅ Registro exitoso:")
        it.mostrarInfo()
    }.onFailure {
        println(it.message)
    }

    println("----------------------------------")

    // Vehículo 3 con error
    val registro3 = crearTransporte("Camioneta", "", 1000.0, 2000.0)
    registro3.onSuccess {
        println("✅ Registro exitoso:")
        it.mostrarInfo()
    }.onFailure {
        println(it.message)
    }
}
