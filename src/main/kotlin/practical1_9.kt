fun findMax(arr:Array<Int>)
{
    var maxE = arr[0]
    for(i in arr)
    {
        if(i> maxE)
        {
            maxE = i
        }
    }
    println("Maximum Element of the array is $maxE")
}

fun main(args:Array<String>)
{
    fun printArray(vararg nameArray:Int)
    {
        println(nameArray.joinToString())
    }
    fun<T> printArray(nameArray:Array<T>)
    {
        println(nameArray.contentDeepToString())
    }
    var arr = arrayOf(9,18,70,6,5,4)
    print("Element of the array:")
    printArray(arr)
    findMax(arr)
}