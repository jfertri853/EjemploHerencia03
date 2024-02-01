package org.example

fun pedirPersona(): Persona {
    var persona: Persona? = null

    do {
        try {
            print("Introduce tu nombre: ")
            val nombre = readln()

            print("Introduce tu edad: ")
            val edad = readln().toInt()

            persona = Persona(nombre, edad)
        }catch (e: IllegalArgumentException) {
            println(e.message)
        }catch (e: NumberFormatException) {
            println("La edad debe ser un numero entero positivo")
        }
    } while (persona == null)

    return persona
}


fun main() {
    val persona = Persona("Juan", 25)
    println("Nombre: ${persona.nombre}, Edad: ${persona.mostrarEdad()}")
    persona.cumple()
    println(persona)
    println(persona.actividad())
    println()

    val estudiante = Estudiante("Marta", 19, "Medicina)")
    println("Nombre: ${estudiante.nombre}, Edad: ${estudiante.mostrarEdad()}, Carrera: ${estudiante.carrera}")
    estudiante.cumple()
    println(estudiante)
    println(estudiante.actividad())
    println()

    val yoMismo = pedirPersona()
    yoMismo.cumple()
    println(yoMismo)
    println(yoMismo.actividad())
}