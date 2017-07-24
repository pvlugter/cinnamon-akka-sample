lazy val akkaVersion = "2.5.3"

lazy val akkaQuickstartScala = project
  .in(file("."))
  .enablePlugins(Cinnamon)
  .settings(
    name := "akka-quickstart-scala",
    version := "1.0",
    scalaVersion := "2.12.2",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
      Cinnamon.library.cinnamonAkka,
      Cinnamon.library.cinnamonCHMetrics,
      Cinnamon.library.cinnamonOpenTracingZipkin,
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    ),
    cinnamon in run := true, // add Cinnamon agent to forked run
    connectInput in run := true // since the application reads stdin
  )
