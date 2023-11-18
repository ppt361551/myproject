package com.ray

fun main() {
//    println("Hello Kotlin!")
//    Human().hello()
    val h = Human(weight = 66.5f, height =  1.7f)
    println(h.bmi())
    val c : Char = 'A'
    println(c.toInt() > 60)     //use Char.code instead
/*    var name:String
    name = "Ray"*/
}

class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
//    constructor(name: String, weight: Float,height: Float):this(weight, height)
    fun bmi():Float{
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}