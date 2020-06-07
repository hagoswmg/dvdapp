@echo off

rem -- save working directories
set tomcat_home=C:\WmgDev\tools\apache-tomcat-8.5.51
set webapps_dir=%tomcat_home%\webapps
set app_dir=%CD%

echo %tomcat_home%
echo %webapps_dir%
echo %app_dir%

rem -- shutdown tomcat if it is already running
call %tomcat_home%\bin\shutdown.bat

rem -- sleep for 5 seconds giving shutdown to complete
ping 192.0.2.2 -n 1 -w 5000 > nul

rem -- delete webapps directory and its content for fresh tomcat restart
rmdir /q /s %webapps_dir%

rem -- create empty webapps directory
mkdir %webapps_dir%

pause rem -- wait for user interaction

rem -- clean project and redpoly
cd %app_dir%
call mvn clean package
copy /Y %app_dir%\target\ROOT.war %webapps_dir%

rem -- start tomcat
%tomcat_home%\bin\startup.bat

