import sbt._

object Dependencies {
  lazy val scalaTest: ModuleID = "org.scalatest" %% "scalatest" % "3.0.8"
  lazy val sparkVersion: String = "2.4.5"
  lazy val sparkCore: ModuleID = "org.apache.spark" %% "spark-core" % sparkVersion
  lazy val slick: ModuleID = "com.typesafe.slick" %% "slick" % "3.3.2"

}
