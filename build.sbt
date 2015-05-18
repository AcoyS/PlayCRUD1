import play.Project._

name := "computer-database"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean, cache,
"org.postgresql"	%	"postgresql" %	"9.3-1102-jdbc41")


playJavaSettings
