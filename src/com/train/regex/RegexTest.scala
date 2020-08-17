package com.train.regex

import scala.util.matching.Regex

object RegexTest {
    def main(args: Array[String]) {
        val pattern1 = "Scala".r
        val str1 = "Scala is Scalable and cool"
        println(pattern1 findFirstIn str1)

        val pattern2 = new Regex("(S|s)cala")  // 首字母可以是大写 S 或小写 s
        val str2 = "Scala is scalable and cool"
        println((pattern2 findAllIn str2).mkString(","))   // 使用逗号 , 连接返回结果

        val pattern3 = "(S|s)cala".r
        val str3 = "Scala is scalable and cool"
        println(pattern3 replaceFirstIn(str3, "Java"))

        val pattern4 = new Regex("abl[ae]\\d+")
        val str4 = "ablaw is able1 and cool"
        println((pattern4 findAllIn str4).mkString(","))
    }
}
