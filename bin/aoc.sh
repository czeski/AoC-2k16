#!/usr/bin/env bash

run(){
    java -jar target/adventofcode2016-1.0.jar $@
}

build(){
    echo "Building the project..."
    mvn package > /dev/null
    echo "Building completed..."
}

"$@"