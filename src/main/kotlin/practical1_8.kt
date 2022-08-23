import java.util.*
fun main(args:Array<String>)
{ fun printArray(vararg nameArray:Int)
    { println(nameArray.joinToString())
    }
    fun<T> printArray(nameArray:Array<T>)
    { println(nameArray.contentDeepToString())
    }
    val array1= arrayOf<Int>(10,90,60,80,100)
    println("Create Array-1 using arrayOf() method:")
    printArray(array1)
    val array2= Array<Int>(5){0}
    println("Create Array-2 using Array<>() method:")
    printArray(array2)
    val array3= Array(7){i:Int->i}
    println("Create Array-3 using Array and Lambda Function method:")
    printArray(array3)
    val array4= IntArray(5)
    println("Create Array-4 using intArray method:")
    printArray(nameArray = array4)
    val array5= intArrayOf(0,0,0,0,0)
    println("Create Array-5 using intArrayOf method:")
    printArray(nameArray = array5)
    var array6 = arrayOf(intArrayOf(1, 2), intArrayOf(4, 5), intArrayOf(7, 8))
    println("Create 2-D array-6 using arrayOf() and intArrayOf()")
    printArray(nameArray = array6)
    var arr = arrayOfNulls<Int>(5)
    var read= Scanner(System.`in`)
    println("Enter array values")
    for(i in 0..4)
    {
        print("array[$i]=")
        arr[i] = read.nextInt()
    }
    println("The array is")
    printArray(arr)

    println("***********   With Built-in Function   *************")
    arr.sort()
    printArray(arr)

    println("***********   Without Built-in Function   *************")
    fun sorting(arr:Array<Int>)
    {
        val len = arr.size
        println(len)
        var temp = 0
        for (i in 0 until len-1)
        {
            for (j in i until len-1)
            {
                if (arr[i]> arr[j])
                {
                    temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
        }
    }
    print("After sorting without built-in function")
    printArray(arr)
}
