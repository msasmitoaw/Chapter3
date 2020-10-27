fun main() {
    /*
    * ! dan ? sama-sama untuk menangani null pointer
    * ! => lebih memaksa
    * ? => tidak memaksa
    */
    // seharusnya memberikan nilai default 0
    print("Masukkan alas: ")
    val a: Int = readLine()?.toIntOrNull() ?: 0
    // ini juga sama seperti atasnya
    // val b: Int = readLine()?.toInt()!!
    print("Masukkan tinggi: ")
    val t: Int = readLine()!!.toInt()
    println("Hasilnya: ${areaTriangle(a, t)}")
}

fun areaTriangle(a: Int, t: Int): Double = (a * t * 0.5)