@echo off

:: You need to configure the JAVA_HOME_21 environment variable to point to the directory where JDK 1.8 is installed.

set JAVA_HOME=%JAVA_HOME_21%
echo JAVA_HOME=%JAVA_HOME%

set JENKINS_HOME=work-latest

mvn hpi:run -f pom-latest.xml
