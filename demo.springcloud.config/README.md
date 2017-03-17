# demo.springcloud.config
SpringCloud ConfigServer Demo

1. Runtime Enviroment

          OS: Window 10 HOME
          Java: 1.8.0_121
          Git:  2.9.0.windows.1
          Maven:Apache Maven 3.3.9
          STS:3.8.3.RELEASE
          org.springframework.boot:1.5.2.RELEASE
       
       
2. Prerequisite

    to create the local git repository
    
          cd ${user.home}
          mkdir config_repo
          cd config_reop
          git init .
          
          
    to add the four files under the config_repo directory
    
      democonfigserver-dev.properties
      
            zookeeper.address=127.0.0.1:2181
            
      democonfigserver-test.properties
      
            zookeeper.address=Centos6701:2181,Centos6702:2181,Centos6703:2181
            
      democonfigserver-uat.properties
      
            zookeeper.address=192.168.155.111:2181,192.168.155.112:2181,192.168.155.113:2181
            
      democonfigserver-pro.properties
      
            zookeeper.address=**********,***********,**********,************
     
            cd ${user_home}/config_repo
            git add -A .
            git commit -m "SpringCloud ConfigServer demo"
            
3.to download the sourcecode and package
   
            cd your sourcecode directory
            mvn clean package -Dmaven.test.skip=true
            
4. to run demo
   
            cd your sourcecode directroy
            cd demo.springcloud.configserver
            java -jar ./target/demo.springcloud.configserver-0.0.1-SNAPSHOT.jar
            
            cd demo.springcloud.configclient
            java -jar ./target/demo.springcloud.configclient-0.0.1-SNAPSHOT.jar
            
   5. to check configserver
    
      http://localhost:8888/democonfigserver/dev/master
      
           {
	           "name": "democonfigserver",
	           "profiles": ["dev"],
	           "label": "master",
	           "version": "e1f7bce6925d38836daaed4cc46214d6e41d0b8b",
	           "state": null,
	           "propertySources": [{
		            "name": "file://C:\\Users\\asus/config-repo/democonfigserver-dev.properties",
		            "source": {
		          	"zookeeper.address": "127.0.0.1:2181"
		            }
	            }]
            }
	    
     http://localhost:8888/democonfigserver/test/master
     
           {
	       "name": "democonfigserver",
	       "profiles": ["test"],
	       "label": "master",
	       "version": "e1f7bce6925d38836daaed4cc46214d6e41d0b8b",
	       "state": null,
	       "propertySources": [{
		   "name": "file://C:\\Users\\asus/config-repo/democonfigserver-test.properties",
		   "source": {
			"zookeeper.address": "Centos6701:2181,Centos6702:2181,Centos6703:2181"
		   }
	       }]
            }
	 
      http://localhost:8888/democonfigserver/uat/master
    
            {
	         "name": "democonfigserver",
	         "profiles": ["uat"],
	         "label": "master",
	         "version": "e1f7bce6925d38836daaed4cc46214d6e41d0b8b",
	         "state": null,
	         "propertySources": [{
		    "name": "file://C:\\Users\\asus/config-repo/democonfigserver-uat.properties",
		    "source": {
			"zookeeper.address": "192.168.155.111:2181,192.168.155.112:2181,192.168.155.113:2181"
		    }
	        }]
            }
          
6. to check configClient
             
	 http://localhost:8001/zookeeperAddress
	 
	      127.0.0.1:2181
