FROM jboss/wildfly:latest
ENV WILDFLY_HOME ./wildfly-9.0.0.Final
COPY ./target/macroservice.war /opt/jboss/wildfly/standalone/deployments
RUN /opt/jboss/wildfly/bin/add-user.sh -u admin -p admin
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
