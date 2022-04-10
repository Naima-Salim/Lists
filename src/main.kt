fun main (){

    var a = names(listOf("Naima","Tut","Angela","Cudra","Swabrina","Salma","Tessa","Brenda","Judy","Mercy"))
    println(a)

    averageHeight(listOf(1.3,1.76,1.88,2.3,3.2))

    var person=Person("Naima",21,1.4,45.6)
    var person2=Person("mima",22,2.4,67.09)
    var person3=Person("yusuf",34,4.0,12.00)
    var people= listOf(person,person2,person3)
    var order=people.sortedByDescending { person -> person.age }
    println(order)

    var person4=Person("mohamed",32,3.3,24.1)
    var person5=Person("rahma",40,3.7,29.1)
    var morepeople= mutableListOf(person4,person5)
    println(people.plus(morepeople))

    var car=Car("KBCD1213f",123)
    var car2=Car("KBF126f",678)
    var vehicle= listOf(car,car2)
    println(avarageMileage(vehicle))

}

//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc   (2 points)
fun names(name: List<String>):List<String>{
    var x = mutableListOf<String>()
    name.forEachIndexed{ index, s ->
        if (index%2==0)
            x.add(s)
    }
      return x
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)

fun averageHeight(people:List<Double>):String{
    var b =people.sum()
    var k = people.average()
    var y = "$b, $k"
    println(y)
        return y
}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)


//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.  (1 point)

fun addPeople(more:List<Any>):List<Any>{
    return listOf()
}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)
data class Car(var registration:String, var mileage:Int)

fun avarageMileage(f: List<Car>):Int{
    var l=0
    f.forEach { cars->cars.mileage
    l+=cars.mileage
    }
    var total=l/f.count()
    return total


}


