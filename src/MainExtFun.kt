fun main(){
    val umur = 25
    println(umur.tambahSatuu())
    println(umur)
}

// extension fun agar dipanggil seperti memanggil method dari obj/instance
fun Int.tambahSatuu() = plus(2)