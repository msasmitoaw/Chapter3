open class Main(var name: String = ""){
    open fun luas(): Int {
        return 100
    }
}

class SecondMain(name: String) : Main(name) {
    override fun luas(): Int {
        return super.luas()
    }
}

fun main(){
    val secondMain = SecondMain("SAM")
    println(secondMain.luas())
}