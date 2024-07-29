name := "spark-rabbitmq-client"

version := "0.1"

scalaVersion := "2.12.18"

idePackagePrefix := Some("eu.navispeed.rabbitmq")


scalacOptions += "-language:implicitConversions"

val sparkVersion = "3.5.1"



libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided"

libraryDependencies += "net.liftweb" %% "lift-json" % "3.5.0"
libraryDependencies += "com.rabbitmq" % "amqp-client" % "5.21.0"


libraryDependencies += "org.projectlombok" % "lombok" % "1.18.24" % "provided"



libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"

//fix version conflict
ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)
