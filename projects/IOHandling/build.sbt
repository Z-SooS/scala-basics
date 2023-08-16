ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "IOHandling"
  )

libraryDependencies += "com.opencsv" % "opencsv" % "5.7.1"
libraryDependencies += "com.lihaoyi" %% "upickle" % "3.0.0"
