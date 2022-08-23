fun main(args:Array<String>){

     println("please Enter the number bitween 1-12")
    val number = readLine()!!.toInt()

    when(number){

        1 -> print("Janaury")
        2 -> print("February")
        3 -> print("March")
        4 -> print("April")
        5 -> print("May")
        6 -> print("June")
        7 -> print("July")
        8 -> print("August")
        9 -> print("September")
        10 -> print("Octomber")
        11 -> print("November")
        12 -> print("December")

        else -> print("Please Entered valid number")

    }
}