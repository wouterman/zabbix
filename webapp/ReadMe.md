# Zabbix demo application

This is a simple web application used for prototyping health monitoring via Zabbix agents. <br>
This application exposes the health status of two components ('service' and 'ldap') via /actuator/health.

Both health statuses can be toggled via their respective 'toggle' endpoints:
* /toggle/service for the service.
* /toggle/ldap for the ldap.

