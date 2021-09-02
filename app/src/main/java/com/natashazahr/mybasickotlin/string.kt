fun main() {
    var basmallah = "Bismillah"
    for (b in basmallah) {
        println(b)
    }
    val karakterPertama = basmallah[0]
    val karakterTerakhir = basmallah[8]
    val lastChar = basmallah.last()

    //penggabungan 2 string bisa
    //make tanda +

    val supr = "Tasha" + 20
    println(supr + "Dev")

    val s = "Sho"
    println("$s.length is ${s.length}")
}