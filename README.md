# Description
 - Branch no-problem contains the working sample, no multiproject
 - Branch problem multi-project with only the subproject 
 - Branch master contains a the same code in the subproject and the root

Executing `./gradlew bootRun` works
Executing `./gradlew sample-web:bootRun` causes an error: `> The JVM must be started with -noverify for this agent to work. You can use JAVA_OPTS to add that flag.`
