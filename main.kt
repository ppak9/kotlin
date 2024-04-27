
fun checking(){ 
    print("insert number: ")
    var score  = readLine()!!.toInt()
    
    var b = when(score){
        1 -> "1"
        2 -> "2"
        in 3..Int.MAX_VALUE -> "nope!"
        else -> "retry"
    }
    println(b)
}
fun check_type(){
  val b : Any = 2
  if(b is Int){
    println("is Int")
  }
  else{
    println("None")
  }
}

fun list(){
    var testing : MutableList<String> = mutableListOf("park", "jong")
    var testingLocked : List<String> = testing // when the list want to locked, correspond origin and new types
    println(testing[1])
    println(testingLocked)
    println(testing.count()) 
    testing.add("hyun")
    println(testing.last())
}

fun map(){
    var testing : MutableMap<Int,String> = mutableMapOf(100 to "apple")
    // when you apply the type of the Object(mutable), you must declare the type
    println(testing.keys)
}

fun mapTesting(){
    val num2Word : MutableMap<Int,String> = mutableMapOf(1 to "One", 2 to "Two")
    val n = 2
    println("$n is the spelt as '${num2Word[n]}'")
}

fun condition(){
    var temp : Int = 25
    var result : String = when{
            temp < 10 -> "cold"
            temp < 20 -> "warm"
            temp > 20 -> "hotter" 
            else -> "None"
    }
    println(result)
}
    

fun main(){
    condition()
}