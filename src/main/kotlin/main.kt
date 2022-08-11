fun main() {
    /**
    val miZapatilla = Zapatilla("Danver", 41, "negro", false)

    //representacion String
    println("Mi Zapatilla: $miZapatilla")

    //Copiar Instancia
    val tuZapatilla = miZapatilla.copy()
    println("Tu Zapatilla: $tuZapatilla")

    val otraZapatilla = miZapatilla.copy(talla = 45, esOriginal = true)
    println("Otra Zapatilla: $otraZapatilla")


    //Igualdad de instancia
    println("Mi Zapatilla == Tu Zapatilla: ${miZapatilla.equals(tuZapatilla)}")
    println("Tu zapatilla == Otra Zapatilla: ${tuZapatilla == otraZapatilla}")
*/
    println("******* TAREA 1 *******")
    val paises = Pais("Peru", "America",32.92, false)
    println("Paises: $paises")

    val esePais = paises.copy()
    println("Ese pais: $esePais")

    val otroPais = paises.copy(nombre = "Argentina", poblacion = 45.38)
    println("Otro pais: $otroPais")

    println("Paises == Ese pais: ${paises == esePais}")
    println("Ese pais == Otro pais: ${esePais == otroPais}")


    println("\n******** TAREA 2 ********")
    val elJoven = Universitario("Marcos", "UNT",18.03, true)
    println("El Joven: $elJoven")

    val tuJoven = elJoven.copy()
    println("Tu Joven: $tuJoven")

    val otroJoven = elJoven.copy(nombre = "Pablo", promedio = 10.02, estaAprobado = false)
    println("Otro Joven: $otroJoven")

    println("El Joven == Tu Joven: ${elJoven == tuJoven}")
    println("Tu Joven == Otro Joven: ${tuJoven == otroJoven}")

}
