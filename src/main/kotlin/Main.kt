fun main(args: Array<String>) {
    print("Digite um número de 1 a 10 para calcularmos a sua tabuada: ")
    var num = readLine()!!.toInt()

    for(i in 10 downTo 1)
        println("$num X $i = ${num * i}")
}