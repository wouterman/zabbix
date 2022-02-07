# Zabbix

## Summary
This repo holds a docker-compose file to easily set up a Zabbix monitoring environment for prototyping how to monitor a Spring Boot application deployed on a Tomcat webserver.

The following containers will be  set up:
* [Zabbix server with MySQL support](https://hub.docker.com/r/zabbix/zabbix-server-mysql)
* [Zabbix web frontend with Nginx and MySQL support](https://hub.docker.com/r/zabbix/zabbix-web-nginx-mysql)
* [Zabbix agent](https://hub.docker.com/r/zabbix/zabbix-agent)
* [MySQL database](https://hub.docker.com/_/mysql)

## Requirements
[Latest Docker CE version for your platform](https://docs.docker.com/install/)

## Installation
1. Checkout this repository.
2. Run the command ``` docker-compose build && docker-compose up -d ``` from the same directory as the compose-file.
3. This will build the webapp image and start up the monitoring stack.
4. Go to [http://localhost:8085](http://localhost:8085)
5. Log in with the default credentials: Admin // zabbix (mind the capital 'A').
6. Go to Configuration -> Hosts -> Zabbix server.
7. Change the 'Agent Interface' DNS-name to 'zabbix-agent' and at 'Connect to' select 'DNS':

![Zabbix](zabbix.jpg)

7. Check the official Zabbix docs for more configuration options [here](https://www.zabbix.com/documentation/4.2/manual).
8. See webapp/readme.md on how to manipulate the health checks for the webapp.
