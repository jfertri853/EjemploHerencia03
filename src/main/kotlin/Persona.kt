package org.example

open class Persona(nombre: String, edad: Int) {

    open var nombre: String = nombre
        set(value) {
            comprobarNombre(this.nombre)
            field = value
        }

    private var edad: Int = edad
        set(value) {
            require(value >= 0) { "Una persona no puede tener edad negativa" }
            field = value
        }


    init {
        comprobarNombre(nombre)
        this.edad = edad
    }


    /** Comprueba que el nombre no esté vacío
     *
     * @param nombre nombre de esta persona
     */
    private fun comprobarNombre(nombre: String) {
        require(nombre.isNotBlank()) {"El nombre no puede estar vacío"}
    }


    /** Suma 1 a la edad
     */
    fun cumple() {
        this.edad ++
    }


    /** Devuelve la edad
     *
     * @return edad de esta persona
     */
    fun mostrarEdad(): Int {
        return edad
    }


    /** Devuelve la actividad que está realizando esta persona
     *
     * @return la actividad
     */
    open fun actividad(): String {
        return "${this.nombre} está haciendo algo"
    }


    override fun toString(): String {
        return "Persona: (Nombre: ${nombre}, Edad: $edad)"
    }


}