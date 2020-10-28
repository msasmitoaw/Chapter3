fun main() {
    hitung()
}

fun hitung() {
    println("Pilih perhitungan: ")
    println("a. Luas Segitiga")
    println("b. Luas Persegi")
    println("c. Luas Lingkaran")
    print("Masukkan pilihan: ")
    var ans: String? = readLine()
    println(ans)
    var status = true
    while (status) {
        status = ans in arrayOf("a", "b", "c")
        println("dalamloop $ans $status")
        when (ans) {
            "a" -> luasSegitiga(status)
            "b" -> luasPersegi(status)
            "c" -> luasLingkaran(status)
            else -> {
                println("goodbye")
                status = false
            }
        }
    }
}

fun luasSegitiga(status: Boolean) {
    print("Masukkan tinggi: ")
    val t: Int = readLine()!!.toInt()
    print("Masukkan alas: ")
    val a: Int = readLine()!!.toInt()
    println("Hasil luas segitiga: ${0.5 * a * t}")
    if (status) hitung()
}

fun luasPersegi(status: Boolean) {
    print("Masukkan sisi: ")
    val s: Int = readLine()!!.toInt()
    println("Hasil luas persegi: ${s * s}")
    if (status) hitung()
}

fun luasLingkaran(status: Boolean) {
    print("Masukkan jari-jari: ")
    val r: Int = readLine()!!.toInt()
    val hasil: Double = (3.14 * r * r)
    println("Hasil luas lingkaran: $hasil")
    if (status) hitung()
}