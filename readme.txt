Steps to Run
------------------
1) Have to run Microservice in this order ---> netflix-eureka-naming-server->netflix-zuul-api-gateway-server->spring-cloud-config-server->products-service->users-service.
2) For distributed log tracing I have used RabbitMQ and Zipkin jar

     download and install rabbit MQ and Zipkin from following links,
		https://zipkin.io/pages/quickstart.html
		https://www.rabbitmq.com/download.html  (Need to install erlang in order to run rabbit mq in windows you can download that from https://www.erlang.org/downloads

Once both softwares downloaded use the following command,
        
		 SET RABBIT_URI=amqp://localhost
		 java -jar zipkin.jar
		 
		 Zipkin console can be viewed in the below link,
		 
			http://localhost:9411/zipkin/