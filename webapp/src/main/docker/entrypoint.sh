#!/usr/bin/env bash

echo "Starting zabbix agent."
service zabbix-agent restart

echo "Starting Tomcat"
/usr/local/tomcat/bin/catalina.sh run