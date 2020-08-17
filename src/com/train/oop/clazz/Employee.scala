package com.train.oop.clazz

class Employee extends Person {

    var salary = 0.0

    override def toString = super.toString + "[salary=" + salary + "]"

}
