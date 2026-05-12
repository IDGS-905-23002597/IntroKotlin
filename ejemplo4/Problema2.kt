fun main() {
    var bateria = 0
    var minuto = 0

    do {
        bateria += 15
        minuto++

        println("Minuto $minuto -> Batería: $bateria%")

    } while (bateria < 100)

    println("La batería llegó al $bateria%")
    println("Carga completa")
}