fun main() {
    val edades = listOf(15, 18, 20, 22, 17)

    println("a) For → Edades mayores o iguales a 18:")
    for (edad in edades) {
        if (edad >= 18) {
            println(edad)
        }
    }
    println(" While → Edades mayores o iguales a 18:")
    var i = 0
    while (i < edades.size) {
        if (edades[i] >= 18) {
            println(edades[i])
        }
        i++
    }

    println("ForEach : Todas las edades en una sola línea:")
    edades.forEach { print("$it, ")
    val estudiantes = listOf("Ana", "Pedro", "Ana", "Javiera", "Carlos", "Pedro")

    // Convertir a Set
    val estudiantesUnicos: Set<String> = estudiantes.toSet()
    println("Cantidad de nombres únicos: ${estudiantesUnicos.size}")
    val asignaturas: Map<String, String> = mapOf(
        "Anto" to "Aplicaciones Móviles",
        "Meriem" to "Base de Datos",
        "Camila" to "Full Stack",
        "Matias" to "Redes"
    )
    println("Asignatura favorita de Anto: ${asignaturas["Anto"]}")
    println("Asignatura favorita de Matias (no existe): ${asignaturas["Matias"]}")
    println("Operaciones con la lista de edades:")

    // 1) .find : primera edad mayor a 1
    val primeraMayor18 = edades.find { it > 18 }
    println("Primera edad mayor a 18: $primeraMayor18")

    // 2) .any : ¿hay menores de 18?
    val hayMenores = edades.any { it < 18 }
    println("¿Hay menores de 18?: $hayMenores")

    // 3) .all : ¿todos son adultos?
    val todosAdultos = edades.all { it >= 18 }
    println("¿Todos son adultos?: $todosAdultos")

    // 4.map : edades multiplicadas por 2
    val edadesDobles = edades.map { it * 2 }
    println("Edades multiplicadas por 2: $edadesDobles")

    //5. .filter :solo mayores de edad
    val mayoresDeEdad = edades.filter { it >= 18 }
    println("Solo mayores de edad: $mayoresDeEdad")

    //.sum y .average
    val suma = edades.sum()
    val promedio = edades.average()
    println("Suma total de edades: $suma")
    println("Promedio de edades: $promedio")
}
