val scala3Version = "3.4.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kyo-hello-world",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies ++= Seq (
        "io.getkyo" %% "kyo-core" % "0.8.10",
        "io.getkyo" %% "kyo-direct" % "0.8.10",
        "io.getkyo" %% "kyo-cache" % "0.8.10",
        "io.getkyo" %% "kyo-stats-otel" % "0.8.10",
        "io.getkyo" %% "kyo-sttp" % "0.8.10"
      )
  )
