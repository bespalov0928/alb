FROM maven:3.9.6-openjdk-17
RUN mkdir alb_order
WORKDIR alb_order
COPY . .
RUN mvn package -Dmaven.test.skip=true
RUN mvn install
CMD["java", "-jar", "target/order.jar"]