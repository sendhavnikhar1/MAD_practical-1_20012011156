fun main(args:Array<String>){

    println("please Enter the number")
    val number = readLine()!!.toInt()

    val answer = if(number % 2 !=0) "number is Even number" else "Number is Odd Number"

    print(""+number)
    print(""+answer)
}
