package lec1

import scala.io.StdIn.readLine

object task2 extends App {
  val Array(n, targetSum) = readLine().split(" ").map(_.toInt)
  val iavCarNums = readLine().split(" ").map(_.toInt)

  var count = 0
  var sum = 0
  var j = 0

  for (i <- 0 until n) {
    if (iavCarNums(i) == targetSum) { count += 1; j = i + 1; sum = 0; }
    else if (iavCarNums(i) < targetSum) {
      sum += iavCarNums(i)
      while (sum >= targetSum && j <= i) {
        if (sum == targetSum) count += 1
        sum -= iavCarNums(j)
        j += 1
      }
    }
    else { sum = 0; j = i + 1 }
  }

  println(count)
}

//object task2 extends App {
//  val iavParams = readLine().split(" ").map(_.toInt)
//  val iavCarNums = readLine().split(" ").map(_.toShort).toList
//  var count = 0
//  var sum = 0
//  var j = 0
//
//  private def deleteFirst(): Unit = {
//    while (sum >= iavParams(1)) {
//      if (sum == iavParams(1)) count += 1
//      sum -= iavCarNums(j)
//      j += 1
//    }
//  }
//
//  for (i <- 0 until iavParams(0)) {
//    if (iavCarNums(i) == iavParams(1)) { count += 1; j = i + 1; sum = 0; }
//    else if (iavCarNums(i) < iavParams(1)) {
//      sum += iavCarNums(i)
//      deleteFirst()
//    }
//    else { sum = 0; j = i + 1 }
//  }
//
//  println(count)
//}
