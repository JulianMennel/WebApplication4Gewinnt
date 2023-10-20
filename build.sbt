val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "4-Gewinnt",
    version := "0.9 alpha",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test",
      "org.scalactic" %% "scalactic" % "3.2.10",
      "org.scalatest" %% "scalatest" % "3.2.10" % "test"),
    libraryDependencies += ("org.scala-lang.modules" %% "scala-swing" % "3.0.0").cross(CrossVersion.for3Use2_13),
    libraryDependencies += ("com.google.inject" % "guice"% "4.2.3"),
    libraryDependencies += ("org.scala-lang.modules" %% "scala-xml" % "2.0.0"),
    libraryDependencies += ("com.typesafe.play" %% "play-json" % "2.9.2").cross(CrossVersion.for3Use2_13), 
    jacocoCoverallsBranch := sys.env.get("CI_BRANCH"),
  )
  .enablePlugins(JacocoCoverallsPlugin)