package org.example

class Estudiante(nombre: String, edad: Int, carrera: String): Persona(nombre, edad) {

    override var nombre: String = nombre
        get() = field.uppercase()

    var carrera: String = carrera
        private set

    init {
        require(carrera.isNotBlank()) {"Un estudiante debe tener una carrera"}
    }

    /** Devuelve la actividad que está realizando este estudiante
     *
     * @return la actividad
     */
    override fun actividad(): String {
        return "${this.nombre} está estudiando a ratos"
    }

    override fun toString(): String {
        return "Estudiante: " + super.toString().dropLast(1).drop(9) + ", Carrera: $carrera"
    }


}