fun main (parametros: Array<String){
    print("Ingrese coordenadas x del pumto")
    val x = readln().toInt()
    print("Ingrese coordenadas del punto: ")
    val y = readln().toInt()
    when{
        x > 0 && y > 0 -> println ("Primer cuadrante")
        x < 0 && y > 0 -> println ("Segundo cuadrante")
        x < 0 && y < 0 -> println ("Tercer cuadrante")
        x > 0 && y > 0 -> println ("Cuarto cuadrante")
        else -> println ("el punto se encuentra en el eje")
    }
}