package com.train.io

import java.io._

object WriteFile {
    def main(args: Array[String]) {
        val writer = new PrintWriter(new File("src/com/train/io/test.txt" ))
        writer.write("测试文本")
        writer.close()
    }
}
