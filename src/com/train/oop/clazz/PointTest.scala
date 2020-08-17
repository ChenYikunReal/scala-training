package com.train.oop.clazz

object PointTest {
    def main(args: Array[String]) {
        val loc = new Location(10, 20, 15);
        // 移到一个新的位置
        loc.move(10, 10, 5);
    }
}
