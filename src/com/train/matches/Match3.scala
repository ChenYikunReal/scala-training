package com.train.matches

object Match3 {

    def main(args: Array[String]) {
        println(matchTest(0))
        println(matchTest(1))
        println(matchTest(2))
        println(matchTest(3))
        println(matchTest(4))
    }

    def matchTest(x: Any): Any = x match {
        //在0或空字符串的情况下,返回false
        case 0 | "" => false
        // 在模式匹配中使用if
        case x if x == 2 || x == 3 => "2或3"
        //在10及以下的其他偶数,返回"偶数"
        case 2 | 4 | 6 | 8 | 10 => "偶数"
        case _ => "其他"
    }

}
