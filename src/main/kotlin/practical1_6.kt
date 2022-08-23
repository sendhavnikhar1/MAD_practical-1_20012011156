fun main(args:Array<String>){

    println("please Enter the Value")
    val number1= readLine()!!.toInt()
    val number2= readLine()!!.toInt()
    val number3=readLine()!!.toInt()

    val add= number1+number2+number3
    val sub = number1-number2-number3
    val multy = number1*number2*number3
    val divition = number1/number2

    println("1.Addition / 2. Substraction /3.Multiplication /4. Divition")

    val value= readLine()!!.toInt()
    when(value){

        1 -> print("Addition : "+add)
        2 -> print("Substraction "+sub)
        3 -> print("Multiply "+multy)
        4 -> print("divition " +divition)



    }
}