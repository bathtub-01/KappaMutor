// See README.md for license details.

ThisBuild / scalaVersion     := "2.13.14"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.github.bathtub01"

//val chiselVersion = "6.4.3-tywaves-SNAPSHOT"
val chiselVersion = "6.5.0"

lazy val root = (project in file("."))
  .settings(
    name := "sc-machine",
    libraryDependencies ++= Seq(
      "org.chipsalliance" %% "chisel" % chiselVersion,
      "org.scalatest" %% "scalatest" % "3.2.19" % "test",
      //"com.github.rameloni" %% "tywaves-chisel-api" % "0.4.2-SNAPSHOT"
    ),
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit",
      "-Ymacro-annotations",
    ),
    addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % chiselVersion cross CrossVersion.full),
  )
