#!/usr/bin/env bash
mvn clean install
mvn exec:java -pl runner -Dexec.mainClass="chocoloatefeast.ChocolateFeast"
