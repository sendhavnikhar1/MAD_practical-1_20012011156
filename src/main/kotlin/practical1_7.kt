fun main(args:Array<String>){

    println("please Enter the number")
    val number = readLine()!!.toInt()
    val result: Long = factorial(number)
    println(" The Factorial of $number = $result")

}


fun factorial(number: Int): Long {
    return if(number == 1){
        number.toLong()
    }
    else{
        number*factorial(number-1)
    }
}