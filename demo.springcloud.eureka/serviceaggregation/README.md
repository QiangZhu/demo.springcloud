#Target
   To build the single node ZUUL gateway
     The user Service supplies that which to search the user information by userid and the demparment one provides the service which
   to search the dempartment name by userid,so we need gateway to merge those into the whole one to client.
	
#Configuration

##Port:
    
    SpringCloud ConfigServer : 8888
    Netflix Eureka Server    : 8761
    User Service             : 8081
    Department Service       : 8082
    Netflix ZUUL Service     : 8083
    
##SpringCloud ServerConfig Git Repository files

		cd ${user.home}
		mkdir -p work/demo/zuul-serviceaggregation
		
		eurekaserver.properties
		
		    eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
          eureka.client.regiesterWithEureka=false
          eureka.client.fetchRegistry=false
          
      deptservice.properties
      
          eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
          
      userservice.properties
      
          eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
          
      apiservice.properties
      
          eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka
          eureka.client.regiesterWithEureka=false
          eureka.client.fetchRegistry=true
          
      git add -A .
      git commit -m "Eureka service aggregation demo"
      
#Package

     mvn clean package -Dmaven.test.skip=true
    
#Runtime

##Run
  
      run springconfigserver 
      run eurekaserver
      run user
      run dempartment
      run gateway
      
      
##Data Ready

### To create a department 
  
      POST /deptservice/dept/create HTTP/1.1
      Host: localhost:8082
      Content-Type: application/json;charset=utf-8
      Cache-Control: no-cache
      Postman-Token: 72925e33-532a-b94b-b510-7adafc6bc1e3

      {
	    "name" :"sale"
      }
      
### To validate with finding that deparment 
        
       POST /userservice/user/find HTTP/1.1
       Host: localhost:8081
       Content-Type: application/json;charset=utf-8
       Cache-Control: no-cache
       Postman-Token: 100cc22e-9f74-78aa-fc72-ec6f3231b643

       {
	      "id": 1
       }
      
### To create a user 

       POST /userservice/user/create HTTP/1.1
       Host: localhost:8081
       Content-Type: application/json;charset=utf-8
       Cache-Control: no-cache
       Postman-Token: 8d37b541-327f-5b67-db24-500180f7d686

       {
	      "name":"Jerry",
	      "deptId": 1
       }
       
### To validate with find that user


       POST /userservice/user/find HTTP/1.1
       Host: localhost:8081
       Content-Type: application/json;charset=utf-8
       Cache-Control: no-cache
       Postman-Token: bc5b1d03-a897-f09f-8f82-f51d7c690e12

       {
	      "id": 1
       }
      
##Request ServiceAggregation Api


		POST /apiservice/api/user/find HTTP/1.1
		Host: localhost:8083
		Content-Type: application/json;charset=utf-8
		Cache-Control: no-cache
		Postman-Token: 2dea6aa8-194b-0746-9112-4274983946e6

		{
			"userId" : 1
		}
    	