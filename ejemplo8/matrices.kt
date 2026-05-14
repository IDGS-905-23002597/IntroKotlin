fun main() {

    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    println("INGRESO DE DATOS MATRIZ 1")

    for (fila in 0..2) {
        for (columna in 0..2) {
            print("Ingrese valor [$fila][$columna]: ")
            matriz1[fila][columna] = readln().toInt()
        }
    }

    println("\n INGRESO DE DATOS MATRIZ 2")

    for (fila in 0..2) {
        for (columna in 0..2) {
            print("Ingrese valor [$fila][$columna]: ")
            matriz2[fila][columna] = readln().toInt()
        }
    }

    for (fila in 0..2) {
        for (columna in 0..2) {
            resultado[fila][columna] =
                matriz1[fila][columna] + matriz2[fila][columna]
        }
    }

    println("\n---- RESULTADO DE LA SUMA ----")

    for (fila in 0..2) {
        for (columna in 0..2) {
            print("${resultado[fila][columna]} ")
        }
        println()
    }
}