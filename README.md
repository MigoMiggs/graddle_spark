# graddle_spark
Boilerplate project with spark, gradle and spark running in docker container. 

This project was inspired from what Uncharted has been doing for integration tests. It has the following characteristics:

* Usere Gradle for build
* Has a very simple Spark job
* Has tests for the Spark job, includes a Main for tests so that they can be run inside spark as a job
* Launches a small Spark cluster, one master, two slaves within a Docker container
* Mounts your code directory as a volume so that it can be accessed within the Docker containter
* Overrides "gradlew test" with a custom task, the custom task runs the tests within the Spark cluster via a spark submit command

How to try it out:

1. Build the project using gradlew, run gradlew jar and testsJar to generate the built artifacts
2. Run ./test-environment.sh to launch the Docker container with Spark
3. From the bash command line inside the container, run gradlew test, this will run the tests inside the Spark cluster

