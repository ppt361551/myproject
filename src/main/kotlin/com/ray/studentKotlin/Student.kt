package com.ray.studentKotlin

import java.util.Scanner

fun main() {
//    userInput()
    val stu = Student("Hank", 77, 99)
    stu.print()
    println("High score: ${stu.highest()}")
}

class Student(var name:String?, var english:Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math +
                "\t" + (english + math) / 2)
    }
    fun highest() : Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        /*if (english > math) {
            max = english
        } else {
            max = math
        }*/
        return max
    }
    fun nameCheck(){
        println(name?.length)
    }

    private fun userInput() {
        val scanner = Scanner(System.`in`)
        print("Please enter student's name:")
//    var name = scanner.next()
        var name = null
        print("Please enter student's english:")
        var english = scanner.nextInt()
        print("Please enter student's math:")
        var math = scanner.nextInt()
        val stu = Student(name, english, math)
        stu.print()
        stu.nameCheck()
    }
}