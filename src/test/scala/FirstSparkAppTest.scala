package org.miguelalvarado.miguelspark

import org.scalatest.{ BeforeAndAfterAll, FunSuite}
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf


class FirstSparkAppTest extends FunSuite with BeforeAndAfterAll {

  private var sparkConf:SparkConf = _
  private var sc: SparkContext = _

  override def beforeAll(){
    sparkConf = new SparkConf()
    sparkConf.setAppName("testing-yes")
    sparkConf.setMaster("local")

    sc = new SparkContext(sparkConf)
  }

  val firstSparkApp = new FirstSparkApp

  test("testMain") {
    println("****** testMain")
    firstSparkApp.corejob(sc)
  }

  test("testMycoolfunction") {
    println("****** testMycoolfunction")
    firstSparkApp.mycoolfunction();
  }

  override def afterAll(){
    sc.stop()
  }

}
