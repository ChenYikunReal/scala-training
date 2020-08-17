package com.train.matches

object Match2 {

    def main(args: Array[String]) {
        println(matchTest(1))
        println(matchTest("two"))
        println(matchTest(6))
        println(matchTest("test"))
    }

    def matchTest(x: Any): Any = x match {
        case 1 => "one"
        case "two" => 2
        case y: Int => "scala.Int"
        case _ => "other"
    }

}
