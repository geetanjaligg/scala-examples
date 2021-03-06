import org.apache.spark.{SparkContext, SparkConf}

object count{
  def main(args: Array[String]) {
    println("++ count ++")
    val sparkconf = new SparkConf().setMaster("local").setAppName("count")
    val sc = new SparkContext(sparkconf)

    val file = sc.textFile("src/resources/test.log") // source : http://www.monitorware.com/en/logsamples/apache.php
    println("Count: " + file.count())

  }
}