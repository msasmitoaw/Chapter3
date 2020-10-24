fun main(){
    println("test")
    argument(0,22,444,55,22,25)
}

fun argument(vararg test: Int){
    println(test[0])
    println(test[1])
    println(test[2])
    println(test[3])
}