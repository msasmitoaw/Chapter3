fun main(){
    val mahasiswa1 = Mahasiswa("Sam", 123)
    mahasiswa1.panggil()
    val mahasiswa2 = MahasiswaGabut("Santoro", 122, "GI")
    mahasiswa2.panggil()
}

/* nama sekaligus menjadi attr dan di private shg hanya diakses oleh class tsb */
open class Mahasiswa(private val nama: String, private val nim: Int){
    open fun panggil(){
        println("Nama saya $nama, NIM $nim")
    }
}

/* sekarang nim menjadi parameter yang digunakan untuk syarat dari parent/super
* dan nim yang tidak dipakai sama mahasiswa gabut ini
* */
class MahasiswaGabut(private val name: String, nim: Int, private val game: String) : Mahasiswa(name, nim) {
    override fun panggil(){
        println("Nama gueh $name")
    }
}