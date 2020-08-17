package com.train.io

import scala.io._

object Scanner {
    def main(args: Array[String]) {
        val line = StdIn.readLine()
        println("你输入的是: " + line)
    }
}
