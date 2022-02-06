FROM adoptopenjdk/maven-openjdk11:latest AS MAVENBUILD
COPY . /src/
WORKDIR /src
RUN mvn clean package

FROM tomcat:9.0.45-jdk11-openjdk
USER root
RUN wget https://repo.zabbix.com/zabbix/5.0/ubuntu/pool/main/z/zabbix-release/zabbix-release_5.0-1+focal_all.deb \
    && dpkg -i zabbix-release_5.0-1+focal_all.deb \
    && apt update \
    && apt install zabbix-agent \
    && rm -rf ${CATALINA_HOME}/webapps/* \
    && rm -rf zabbix-release_5.0-1+focal_all.deb
COPY --from=MAVENBUILD /src/target/zabbix.war /usr/local/tomcat/webapps/ROOT.war
COPY entrypoint.sh /entrypoint.sh
ENTRYPOINT ["/entrypoint.sh"]
