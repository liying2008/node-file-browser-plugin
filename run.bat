@echo off

:: You need to configure the JAVA_HOME_8 environment variable to point to the directory where JDK 1.8 is installed.

set JAVA_HOME=%JAVA_HOME_8%
echo JAVA_HOME=%JAVA_HOME%

mvn hpi:run
