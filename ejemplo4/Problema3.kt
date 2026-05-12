fun main() {
    val claveCorrecta = "jaqui"
    var intentos = 0
    var acceso = false

    while (intentos < 3) {
        print("Ingresa tu clave de seguridad: ")
        val clave = readLine()!!

        if (clave == claveCorrecta) {
            acceso = true
            break
        } else {
            intentos++
            println("Tu clave es incorrecta. Intentos fallidos: $intentos")
        }
    }

    if (acceso) {
        println("Acceso concedido.")
    } else {
        println("Error haz puesto mal tu clave 3 veces.")
    }
}