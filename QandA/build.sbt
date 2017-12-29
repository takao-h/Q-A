name := """QandA"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++={
  val slickJodaMapperV = "2.2.0"
  val jodaTimeV = "2.9.3"
  val jodaConvertV = "1.8.1"
  Seq(
    jdbc,
    cache,
    ws,
    "com.typesafe.slick" %% "slick" % "3.1.1",
    "org.slf4j" % "slf4j-nop" % "1.7.20",
    "mysql" % "mysql-connector-java" % "5.1.35"
  )
}



