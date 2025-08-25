fun main() {
    // 1) VARIABLES Y OPERADORES ARITMÉTICOS
    val numeroEntero: Int = 10
    val numeroDecimal: Double = 3.5

    val suma = numeroEntero + numeroDecimal
    val resta = numeroEntero - numeroDecimal
    val multiplicacion = numeroEntero * numeroDecimal
    val division = numeroEntero / numeroDecimal

    println("La suma es: $suma")
    println("La resta es: $resta")
    println("La multiplicación es: $multiplicacion")
    println("La división es: $division")
    //  SEGURIDAD ANTE NULOS (NULL SAFETY)
    var texto: String? = "Kotlin es genial"
    println("Longitud inicial con valor: ${texto?.length}")

    texto = null
    println("Longitud luego de asignar null: ${texto?.length}")

    /*
    Reflexión en comentario:
    En Java tendríamos que hacer algo como:
        if(texto != null){
            System.out.println(texto.length());
        }
    para evitar el NullPointerException.
    En Kotlin basta con usar el operador de llamada segura (?.)
    */
    // LÓGICA CONDICIONAL CON WHEN
    val numeroDia: Int = 3

    val diaSemana = when(numeroDia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Número no válido (debe ser del 1 al 7)"
    }
    println("El día correspondiente es: $diaSemana")
    // PREGUNTAS DE REFLEXIÓN
    println("\n--- Reflexión ---")
    println("Diferencias y similitudes entre Kotlin y Java:")
    println("- Kotlin requiere menos código, por ejemplo para manejar nulos.")
    println("- En Kotlin usamos ?. y ?: en lugar de if/else para null checks.")
    println("- La estructura when es más expresiva y clara que switch en Java.")
    println("- Ambos lenguajes permiten operaciones aritméticas y control de flujo similares.")

    println("\nAplicación práctica:")
    println("La seguridad ante nulos (Null Safety) evita errores comunes en apps móviles, como crashes por valores inesperados.")
    println("La expresión when permite manejar múltiples casos de forma legible, ideal para flujos de menú o validaciones en apps.")
}