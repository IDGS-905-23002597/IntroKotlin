import kotlin.math.pow

fun limpiarPantalla() {
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun areaCuadrado(lado: Double): Double {
    return lado * lado
}

fun areaRectangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaCirculo(radio: Double): Double {
    return 3.1416 * radio.pow(2)
}

fun main() {
    var opcion: Int
    do {
        limpiarPantalla()
        println("ingrese el area a calcular:")
        println("1. Area de Cuadrado")
        println("2. Area de Rectangulo")
        println("3. Area de Triangulo")
        println("4. Area de Circulo")
        println("5. Salir")
        print("Seleccione una opcion: ")
        opcion = readln().toInt()
        when(opcion) {
            1 -> {
                print("Ingrese el lado del cuadrado: ")
                val lado = readln().toDouble()

                val resultado = areaCuadrado(lado)

                println("El area del cuadrado es: ${
                    String.format("%.2f", resultado)
                }")
            }
            2 -> {
                print("Ingrese la base del rectangulo: ")
                val base = readln().toDouble()

                print("Ingrese la altura del rectangulo: ")
                val altura = readln().toDouble()

                val resultado = areaRectangulo(base, altura)

                println("El area del rectangulo es: ${
                    String.format("%.2f", resultado)
                }")
            }
            3 -> {
                print("Ingrese la base del triangulo: ")
                val base = readln().toDouble()

                print("Ingrese la altura del triangulo: ")
                val altura = readln().toDouble()

                val resultado = areaTriangulo(base, altura)

                println("El area del triangulo es: ${
                    String.format("%.2f", resultado)
                }")
            }
            4 -> {
                print("Ingrese el radio del circulo: ")
                val radio = readln().toDouble()

                val resultado = areaCirculo(radio)

                println("El area del circulo es: ${
                    String.format("%.2f", resultado)
                }")
            }
            5 -> {
                println("finalizado")
            }
            else -> {
                println("Opcion incorrecta")
            }
        }
        if (opcion != 5) {
            println("\n continuar")
            readln()
        }
    } while(opcion != 5)
}