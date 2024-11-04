package lec1

import scala.io.StdIn.{readInt, readLine}

object task1 extends App {
  val n = readInt()
  val nums = readLine().split(" ").map(_.toInt)
  val prefixSums = nums.scanLeft(0)(_ + _).tail
  println(prefixSums.mkString(" "))
}
