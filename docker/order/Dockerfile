#FROM maven:3.6.3-openjdk-17
#RUN mkdir alb_order
#WORKDIR Order
#COPY . .
##RUN mvn package -Dmaven.test.skip=true
#RUN mvn install
#CMD ["java", "-jar", "target/order.jar"]
#EXPOSE 8080

FROM maven:3.6.3-openjdk-17
RUN mkdir order
COPY order.jar order.jar
ENTRYPOINT ["java", "-jar", "order.jar"]
EXPOSE 8080