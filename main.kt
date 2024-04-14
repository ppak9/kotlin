
fun main(){
    val score : Int = 5

    var b = when(score){
        1 -> "1"
        2 -> "2"
        in 3..Int.MAX_VALUE -> "nope!"
        else -> "retry"
    }
    println(b)
}