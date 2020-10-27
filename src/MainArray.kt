fun main (){
    // ini menggunakan top level fun
    // array yang menampung banyak tipe data
    var dataPribadi = arrayListOf("Sam", 25, false)
    var dataPribadi1 = arrayOf("Sam", 25, false)
    // array yang didefinisikan tipe data
    var dataPribadi2 = arrayListOf<String>("Sam", "25", "false")
    // ini memanggil array dari class
    // lamda arg untk meringkas kode, dari argument menjadi body dalam {}
    var dataPri = Array<String> (5) {i -> "namakelas $i"}

    // array
    for (el in dataPribadi) println(el)

}