package com.train.oop.clazz

object PersonTest {
    def main(args: Array[String]): Unit = {
        val fred = new Employee
        fred.name = "Fred"
        fred.salary = 50000
        println(fred)
    }
}
