cd .. &&
mvn archetype:generate -DgroupId=com.mahesh -DartifactId=my-maven-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd my-maven-app
mvn package
