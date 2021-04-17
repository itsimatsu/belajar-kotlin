fun main(){
    val arr1: Array<String> = arrayOf("Lorem", "Ipsum", "Dolor", "el siamet")

//    val lorem: String = arr1[0]
//    arr1.set(0, "Ustami Rajib")
//    arr1.get(1)
//    arr1[1]
//    arr1[0] = "Udin"
    println(arr1[0])

    //Array nullable
    val arr2: Array<String?> = arrayOfNulls(5)
    arr2[0] = null
    arr2[1] = "Rajib"
    arr2[2] = "Jhon"
    arr2[3] = "Doe"
    arr2[4] = "Robert"
    println(arr2[0])
}