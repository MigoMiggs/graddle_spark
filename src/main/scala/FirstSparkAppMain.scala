package org.miguelalvarado.miguelspark;

import org.apache.spark.{SparkConf, SparkContext}


object FirstSparkAppMain {
  def main(args: Array[String]) {


    System.out.println("peopepe")
    // create Spark context with Spark configuration
    /*val sconfig = new SparkConf()
    sconfig.setMaster("local")
    sconfig.setAppName("Miguels killer app")

    val sc = new SparkContext(sconfig)

    // get threshold
    val threshold = args(1).toInt

    // read in text file and split each document into words
    val tokenized = sc.textFile(args(0)).flatMap(_.split(" "))

    // count the occurrence of each word
    val wordCounts = tokenized.map((_, 1)).reduceByKey(_ + _)

    // filter out words with fewer than threshold occurrences
    val filtered = wordCounts.filter(_._2 >= threshold)

    // count characters
    val charCounts = filtered.flatMap(_._1.toCharArray).map((_, 1)).reduceByKey(_ + _)

    val collected = charCounts.collect();

    System.out.println(charCounts.collect().mkString(", "))*/
    val conf = new SparkConf()
    //conf.setMaster("local")
    //conf.setAppName("Miguels Killer App")

    val sc = new SparkContext(conf)
    val fsa = new FirstSparkApp()
    fsa.corejob(sc)

  }
}
