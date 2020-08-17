package com.train.extractor

object Test1 {

    def main(args: Array[String]) {
        println ("Apply 方法 : " + apply("Sam", "gmail.com"));
        println ("Unapply 方法 : " + unapply("Sam@gmail.com"));
        println ("Unapply 方法 : " + unapply("Sam Chen"));
    }

    // 注入方法 (可选)
    // 提取器是从传递给它的对象中提取出构造该对象的参数
    def apply(user: String, domain: String) = {
        user +"@"+ domain
    }

    // 提取方法（必选）
    // 提取器是一个带有unapply方法的对象
    // unapply接受一个对象，然后从对象中提取值，提取的值通常是用来构造该对象的值
    def unapply(str: String): Option[(String, String)] = {
        val parts = str split "@"
        if (parts.length == 2) {
            Some(parts(0), parts(1))
        } else {
            None
        }
    }

}
