fun main(){
    val names = arrayOf("Ustami", "Rajib", "Javascript")
    var length = 0
    val ukuranArray = names.size - 1
    for (name in names){
        println(name)
        length++
    }
    println("Length array = " + length)

    for (i in 0..5){
        println(i)
    }
    for (x in 0..ukuranArray){
        println("Index ke $x =  ${names.get(x)} ")
    }
}