package com.train.iterator

object IteratorTest {
    def main(args: Array[String]) {
        val it = Iterator("Baidu", "Alibaba", "Tencent")
        while (it.hasNext){
            println(it.next())
        }
    }
}
