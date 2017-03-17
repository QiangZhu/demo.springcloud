# demo.springcloud.eureka.ha
SpringCloud Eureka HA demo

   1. Runtime Enviroment
   
          OS: Window 10 HOME
	      Java: 1.8.0_121
	      Git:  2.9.0.windows.1
	      Maven:Apache Maven 3.3.9
	      STS:3.8.3.RELEASE
	      org.springframework.boot:1.5.2.RELEASE
	  
   2. Prerequisite
   
      2.1 to create the local git repository 
      
           cd your ${user.home}
	       mkdir /work/demo/eureka-ha
	       cd eureka-ha
	       git init .
	           
      2.2 to create the three files under ${user.home}/work/demo/eureka-ha
         
	 2.2.1 eureka-server-ha.properties
	  
	     spring.application.name=eureka-server-ha
         eureka.client.serviceUrl.defaultZone=http://localhost:3300/eureka/,http://localhost:3301/eureka/
         eureka.client.regiesterWithEureka=false
         eureka.client.fetchRegistry=false
	     
	  2.2.2 service-regist.properties
	  
	     eureka.client.serviceUrl.defaultZone=http://localhost:3300/eureka/,http://localhost:3301/eureka/
	
	  2.2.3 service-client.properties
	  
	     eureka.client.serviceUrl.defaultZone=http://localhost:3300/eureka/,http://localhost:3301/eureka  
         eureka.client.regiesterWithEureka=false
         eureka.client.fetchRegistry=true
	     
      2.3 to add and commit the files into the local git repository
      
	     cd your ${user.home}/work/demo/eureka-ha
	     git add -A .
	     git commit -m "SpringCloud Eureka HA demo"
	
   3. to download or git clone sourcecode ,then compile and package jar
   
            cd your local sourcecode directory
	      mvn clean package -Dmaven.test.skip=tru
   4. run 
      
      4.1 to run the single SpringCloud ConfigServer java process (port:8888)
      
          java -jar ./target/demo.springcloud.eureka.ha.configservers.server01-0.0.1-SNAPSHOT.jar
	  
     4.2 to run the two Netflix Eureka Servers( ports:3300,3301)
     
          java -jar ./target/demo.springcloud.eureka.ha.servers.server01-0.0.1-SNAPSHOT.jar
	      java -jar ./target/demo.springcloud.eureka.ha.servers.server02-0.0.1-SNAPSHOT.jar
	      
     4.3 to run the two Netflix Eureka Clients( to regiest the two EchoService into the HA Eureka Servers,ports:8080,8070)
     
         java -jar ./target/demo.springcloud.eureka.ha.services.service01-0.0.1-SNAPSHOT.jar
	     java -jar ./target/demo.springcloud.eureka.ha.services.service01-0.0.1-SNAPSHOT.jar
	     
     4.4 to run the single caller which to discovery the EchoService in HA Eureka Servers(port:7070)
     
         java -jar ./target/demo.springcloud.eureka.ha.clients.client01-0.0.1-SNAPSHOT.jar
	 
     4.5 to test 
     
       
      4.5.1 to view the Eureka dashboard
	
	
	      http://localhost:3300  or http://localhost:3301
	      
	      
      4.5.2 to test
	
	
	     http://localhost:7070/hello
	     
	     I use the postman to test
	     
	     POST /hello HTTP/1.1
             Host: localhost:7070
             Content-Type: application/x-www-form-urlencoded
             Cache-Control: no-cache
             Postman-Token: 6885b18e-9af2-1e64-b450-0b1882291212

             message=hello+world!
         
     
	   
