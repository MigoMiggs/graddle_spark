#!/bin/sh
docker run -e GRADLE_OPTS="-Dorg.gradle.daemon=true" -v $(pwd):/opt/graddle-spark -it --workdir="/opt/graddle-spark" uncharted/sparklet:2.3.1 bash


# the Gradle daemon speeds things up
#-e GRADLE_OPTS="-Dorg.gradle.daemon=true" \
# This log4j.properties file silences a bunch of ugly output from Spark
#-v $(pwd)/src/test/resources/log4j.properties:/usr/local/spark/conf/log4j.properties \
# mount your codebase as a volume within the container.
#-v $(pwd):/opt/graddle-spark \
# interactive mode
#-it \
# set our working directory to the location of our code
#--workdir="/opt/graddle-spark" \
# fire up the spark container with a shell (bash)
# uncharted/sparklet:1.5.2 bash