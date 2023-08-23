val scala2 = "2.13.11"
val scala3 = "3.3.0"

lazy val root = project.in(file("."))
  .settings(
    name := "dotty-construct-tuple-benchmark",
    organization := "com.example",
    crossScalaVersions := Seq(scala2, scala3),
    scalaVersion := scala3,
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= (if (scalaVersion.value.startsWith("2")) Seq("com.chuusai" %% "shapeless" % "2.3.10") else Seq()),
  )
  .enablePlugins(JmhPlugin)
