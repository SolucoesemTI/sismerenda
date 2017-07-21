#!/bin/bash
#mvn install:install-file -Dfile=./towel-v1.2.2.jar -DgroupId=com.towel.towel  -DartifactId=towel -Dversion=1.2.2 -Dpackaging=jar
#mvn deploy:deploy-file -DgroupId=com.towel.towel \
#    -DartifactId=towel \
#    -Dversion=1.2.2 \
#    -Dpackaging=jar \
#    -Dfile=./towel-v1.2.2.jar \
#    -DrepositoryId=nexus \
#    -Durl=https://repo1.maven.org/maven2/ -X

mvn deploy:deploy-file -Dfile=./towel-v1.2.2.jar -DrepositoryId=nexus -Durl=https://repo1.maven.org/maven2/ -X
