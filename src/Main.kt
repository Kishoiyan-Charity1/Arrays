fun main() {
    var numbers = arrayOf(21, 32, 475, 8, 92, 1, 5)
    println(numbers[2])
    var sum = (numbers[0] + numbers[2])
    println(sum)

    pipo(arrayOf("ken", "man", "tom"))


    var names = arrayOf("ritty", "ranny", "simi")
    println(names[2])
//array can take any type of variable
    var country = arrayOf("kenya", 5200000, 66.95, true)


    var name = arrayOf("abby", "brenda", "carol", "diana", "nadia", "flo")
    println(name.get(4))
    println(name.contentToString())
    name.set(2, "ritty")
    println(name.contentToString())
    println(name.get(2))

//adding elements to an arrays
    var name2 = name.plus("george")
    println(name2.contentToString())
    var newName = arrayOf("george", "fiona")
    name = name.plus(newName)
    println(name.contentToString())

//getting index of new names
    println(names.indexOf("abby"))

//adding arrays
    var nums = arrayOf(21, 22, 23, 24, 55, 88)
    println(nums.sum())
    println(nums.average())

//largest or smallest elements in arrays
    var num = arrayOf(21, 22, 23, 24, 55, 88)
    println(num.maxOrNull())
    println(num.minOrNull())

//sorting numbers
    var numb = arrayOf(21, 22, 23, 24, 55, 88)
    var sortedNumb = nums.sortedArrayDescending()
    println(sortedNumb.contentToString())

    var numbe = arrayOf(21, 22, 23, 24, 55, 88)
    nums.forEach { numbe ->

    }

    var places = arrayOf("dubai", "kenya", "mumbai")
    for (place in places) {
        println(place.capitalize())
    }

    fun cap(pipo: Array<String>) {
        pipo.forEach { z ->
            println(z.uppercase())

        }


    }


}





