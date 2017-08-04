name := """jmh-study"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.1",
  "com.h2database" % "h2" % "1.4.196",
  "com.danielasfregola" %% "random-data-generator" % "2.1",
  "org.slf4j" % "slf4j-nop" % "1.7.25"
)

enablePlugins(JmhPlugin)