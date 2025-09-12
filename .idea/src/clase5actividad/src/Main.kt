fun main() {
    val persona = Persona("anto", 20)
    val empleado = Empleado("roxana", 20, "Desarrollador", 1200.0)

    persona.presentarse()   // Hola, mi nombre es anto
    empleado.presentarse()  // Hola, soy Roxana y mi puesto es Desarrollador.
    empleado.mostrarPuesto() // Roxana trabaja como Desarrollador.
}

/*
 Reflexión:
 La misma llamada al metodo presentarse produce resultados distintos
 dependiendo si el objeto es de tipo Persona o de tipo Empleado.
 Esto se debe al POLIMORFISMO, ya que la clase Empleado sobreescribe
 el comportamiento del metodo de la clase base Persona.
*/
