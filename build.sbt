lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.5"
)

lazy val rss = (project in file(".")).settings(commonSettings: _*).aggregate(domain, poller, updater, client)

lazy val updater = project.settings(commonSettings: _*)
lazy val poller = project.settings(commonSettings: _*)
lazy val client = project.settings(commonSettings: _*)
lazy val domain = project.settings(commonSettings: _*)




    