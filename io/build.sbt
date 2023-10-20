name := "io"
version := "1.0 alpha"
scalaVersion := "3.2.2"
libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test",
      "org.scalactic" %% "scalactic" % "3.2.10",
      "org.scalatest" %% "scalatest" % "3.2.10" % "test",
      "com.google.inject" % "guice"% "4.2.3",
      "org.scala-lang.modules" %% "scala-xml" % "2.0.0",
      "com.typesafe" % "config" % "1.4.2",
      "org.http4s" %% "http4s-ember-server" % "1.0.0-M39",
      ("org.scala-lang.modules" %% "scala-swing" % "3.0.0").cross(CrossVersion.for3Use2_13),
      ("com.typesafe.play" %% "play-json" % "2.9.2").cross(CrossVersion.for3Use2_13),
      ("com.typesafe.slick"    %% "slick"            % "3.5.0-M3").cross(CrossVersion.for3Use2_13),
      ("com.typesafe.slick"    %% "slick-hikaricp"   % "3.5.0-M3").cross(CrossVersion.for3Use2_13),
      ("org.mongodb.scala" %% "mongo-scala-driver" % "4.3.1").cross(CrossVersion.for3Use2_13),
      "mysql" % "mysql-connector-java" % "8.0.32",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.8.0",
      "com.typesafe.akka" %% "akka-http" % "10.5.0",
      "com.typesafe.akka" %% "akka-stream" % "2.8.0")