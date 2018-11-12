package org.miguelalvarado.miguelspark

import org.scalatest.tools.Runner

object Main {
  def main(args: Array[String]): Unit = {
    val testResult = Runner.run(Array("-o", "-R", "build/classes/scala/test"))
    if (!testResult) {
      System.exit(1) // exit with an error code if a test failed
    }
  }
}