FROM tomcat:9.0.45-jdk11-openjdk

USER root

RUN wget https://repo.zabbix.com/zabbix/5.0/ubuntu/pool/main/z/zabbix-release/zabbix-release_5.0-1+focal_all.deb \
    && dpkg -i zabbix-release_5.0-1+focal_all.deb \
    && apt update \
    && apt install zabbix-agent \
    && rm -rf ${CATALINA_HOME}/webapps/* \

COPY ${project.artifactId}-${project.version}.${project.packaging} /usr/local/tomcat/webapps/${project.build.finalName}.${project.packaging}

COPY entrypoint.sh /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
