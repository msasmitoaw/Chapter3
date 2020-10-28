fun main(){
    var status = true;
    do {
        println("=====================")
        println("Pilih perhitungan: ")
        println("1. Luas Segitiga")
        println("2. Luas Lingkaran")
        println("3. Keliling Lingkaran")
        println("4. Keluar")
        print("Masukkan pilihan: ")
        val pilihan = readLine()!!.toInt()
        when (pilihan) {
            1 -> luasSegitiga()
            2 -> luasLingkaran()
            3 -> kelilingLingkaran()
            4 -> status = false
            else -> println("masukkan salah")
        }
    } while (status)
}

fun luasLingkaran(){
    print("Masukkan jari-jari: ")
    val r: Int = readLine()!!.toInt()
    println("Hasil luas lingkaran: ${3.14 * r * r}")
}

fun kelilingLingkaran(){
    print("Masukkan diameter: ")
    val d: Int = readLine()!!.toInt()
    println("Hasil luas lingkaran: ${3.14 * d}")
}

fun luasSegitiga(){
    print("Masukkan tinggi: ")
    val t: Int = readLine()!!.toInt()
    print("Masukkan alas: ")
    val a: Int = readLine()!!.toInt()
    println("Hasil luas segitiga: ${0.5 * a * t}")
}