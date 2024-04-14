fun max(a: Int, b: Int) : Int{
    return if(a > b) a else b
}

fun greet(name: String){
    println("hello $name!")
}

fun main(){
    val c = max(3,2)
    println(c)

    greet("박종현")
}