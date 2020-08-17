package com.train.matches

object Match1 {

    def main(args: Array[String]) {
        println(matchTest(1))
        println(matchTest(2))
        println(matchTest(3))
    }

    def matchTest(x: Int): String = x match {
        case 1 => "one"
        case 2 => "two"
        case _ => "many"
    }

}
