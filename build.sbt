name := "sangria-akka-http-example"
version := "0.1.0-SNAPSHOT"

description := "An example GraphQL server written with akka-http and sangria."

scalaVersion := "2.12.4"
scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % "1.3.0",
  "org.sangria-graphql" %% "sangria-spray-json" % "1.0.0",
  "com.typesafe.akka" %% "akka-http" % "10.0.10",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.10",

  // Akka
  "com.typesafe.akka" %% "akka-actor" % "2.5.6",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.6" % Test,

  // Akka streams
  "com.typesafe.akka" %% "akka-stream" % "2.5.6",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.6" % Test,

  // Akka cluster
  "com.typesafe.akka" %% "akka-cluster" % "2.5.6",

  // Akka cluster sharding
  "com.typesafe.akka" %% "akka-cluster-sharding" %  "2.5.6",

  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

Revolver.settings
enablePlugins(JavaAppPackaging)
