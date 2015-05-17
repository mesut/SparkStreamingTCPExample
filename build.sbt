
name := "SparkExample"

version := "1.0"

scalaVersion := "2.10.4"


// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.3.1",
  "org.apache.spark" % "spark-streaming_2.10" % "1.3.1"
)

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.2.10" // put this at the top of the file,leave the next line blank

