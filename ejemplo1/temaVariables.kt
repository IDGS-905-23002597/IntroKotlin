
fun main(){
    val saludo: String ="Hola" //Inmutable
    var nombre: String = "Kotlin" //mutable
    println ("$saludo, $nombre!!!")

    println("Ingrese el primer numero")
    val num1 = readln().toInt()

    println("Ingrese el segundo numero")
    val num2 = readln().toInt()

    var res = num1 + num2
    printl ("La suma es: $res")
}  