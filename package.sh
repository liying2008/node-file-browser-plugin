#!/usr/bin/env bash

mvn -Dchangelist= -Denforcer.skip=true -DskipTests clean package
