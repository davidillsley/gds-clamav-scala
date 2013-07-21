organization := "uk.gov.gds"

name := "gds-clamav"

version := "0.7.4-SNAPSHOT"

scalacOptions += "-deprecation"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
        "org.scalatest" %% "scalatest" % "2.0.M5b" % "test",
        "jmimemagic" % "jmimemagic" % "0.1.1",
        "com.typesafe" %% "scalalogging-slf4j" % "1.0.1"
    )

publishArtifact in (Test, packageSrc) := true

publishTo in ThisBuild <<= (version) { version: String =>
    val publishType = if (version.endsWith("SNAPSHOT")) "snapshots" else "releases"
    Some(
        Resolver.file(
            "alphagov github " + publishType,
            file(System.getProperty("user.home") + "/alphagov.github.com/maven/" + publishType)
        )
    )
}
