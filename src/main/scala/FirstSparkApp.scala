package org.miguelalvarado.miguelspark;

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

class FirstSparkApp {


  def corejob(sc:SparkContext): Unit ={
    val rddl = sc.makeRDD(Array(1,2,3,4,5,6,7,8,9,10))
    println("********* Output from Miguel's killer application")
    println("MASTER  " + sc.master)
    rddl.collect().foreach(println)
  }

  def mycoolfunction(): Unit ={
    println("cool function")
    println("I love ")
    println("you so much")
  }
}
