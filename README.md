# spring-boot-kafka-demo

### Things to do:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-kafka-demo.git`
2. Navigate to the folder: `cd spring-boot-kafka-demo`
3. Make sure your ZooKeeper & Kafka already run
4. Run this command to run ZooKeeper: `bin/zookeeper-server-start.sh config/zookeeper.properties`
5. Run this command to run Kafka: `bin/kafka-server-start.sh config/server.properties`
6. Run the application: `mvn clean spring-boot:run`
7. Publish message to kafka topic:

```shell
curl --location --request POST 'http://localhost:8082/api/kafka/publish' \
--header 'topic-name: book-update' \
--header 'Content-Type: application/json' \
--data-raw '{
    "message": "Testing1"
}'
```

8. Publish message to kafka topic:

```shell
curl --location --request POST 'http://localhost:8082/api/kafka/books/publish' \
--header 'topic-name: book-update' \
--header 'Content-Type: application/json' \
--data-raw '{
    "bookName": "Spring Boot Tutorial",
    "author": "Hendi Santika"
}'
```
