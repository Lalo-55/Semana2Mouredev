/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero
 * o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra
 * palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */
fun main() {
    println("Ingresa la primer palabra")
    val palabra1 = readLine()
    println("Ingresa la segunda palabra")
    val palabra2 = readLine()

    if (palabra1!!.length == palabra2!!.length)
        anagrama(palabra1, palabra2)
    else
        println("No es un anagrama")


}

fun anagrama(palabra1: String, palabra2: String) {
    val arrayPalabra1 = arrayListOf<Char>()
    val arrayPalabra2 = arrayListOf<Char>()
    palabra1.lowercase().forEach {
        arrayPalabra1.add(it)
    }
    palabra2.lowercase().forEach {
        arrayPalabra2.add(it)
    }
    if (arrayPalabra1.sorted() == arrayPalabra2.sorted()) {
        println("$palabra1 y $palabra2 forman un anagrama")

    } else {
        println("No es un anagrama")

    }

}