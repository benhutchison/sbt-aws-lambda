name := "sbt-aws-lambda"

organization := "com.gilt.sbt"

sbtPlugin := true

version in ThisBuild := "git describe --tags --always --dirty".!!.trim.replaceFirst("^v", "")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")

val awsSdkVersion = "1.10.77"

scalacOptions += "-target:jvm-1.7"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
  "com.amazonaws"  % "aws-java-sdk-iam"    % awsSdkVersion,
  "com.amazonaws"  % "aws-java-sdk-lambda" % awsSdkVersion,
  "com.amazonaws"  % "aws-java-sdk-s3"     % awsSdkVersion
)

