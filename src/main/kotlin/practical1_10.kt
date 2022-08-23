class Car(com:String, year:Long, price:Int, owner:String, miles:Int,cprice:Int)
{
    var ty:String = com
    var yr =year
    var p:Int = price
    var ow = owner
    var m:Int = miles
    var cp:Int=cprice

    fun getCarPrice()
    {
        println("$" + (p-m).toString())
    }
    fun getCarInformation()
    {
        println("Car Information :$ty,$yr")
        println("Car Owner :$ow")
        println("Miles drive :$m")
        println("Original Car Price : $p")
        println("Current Car Price : $cp")
    }
}
fun main()
{
    println("Creating class car object car1 in next line.")
    println("Object is created and Init is called")
    println("--------------")
    var car1=Car("BMW",2018,300,"Aman",200,250)
    car1.getCarInformation()

    println("Creating class car object car1 in next line.")
    println("Object is created and Init is called")
    println("--------------")
    var car2=Car("Audi",2017,600,"Ram",205,430)
    car2.getCarInformation()
}