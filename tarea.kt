//Definicion de variables
val primerNumero: Int = 5
val segundoNumero: Int = 7
val nombre: String = "Samuel Bayona"
val resultadoTotal: Int = primerNumero + segundoNumero

fun main1() {
    println("Hello, $nombre")
    println("La suma de $primerNumero y $segundoNumero es: $resultadoTotal")
}

//Manejo de nolos

class Persona(val nombre: String, val edad: Int) {

    fun imprimirInformacion() {
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}

fun main() {

    val persona1 = Persona("Samuel Bayona", 17)

    persona1.imprimirInformacion()
}

//Opcionales 

class Persona(val nombre: String, val edad: Int?, val Pais: String?) {

    fun imprimirInformacion() {
        println("Nombre: $nombre")
        println("Edad: ${edad ?: "No especificada"}")
        println("Dirección: ${direccion ?: "No especificada"}")
    }
}

fun main() {

    val persona1 = Persona("Samuel Bayona", 17, "Colombia")
    persona1.imprimirInformacion()

    println()

    val persona2 = Persona("Ana Pérez", null, Argentina)
    persona2.imprimirInformacion()
}

