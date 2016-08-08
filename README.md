Demo sample Rest application using Dropwizard. Dropwizard is highly scallable Rest API Framework 

More details on http://www.dropwizard.io/

### Topics covered

1. Creating server.
2. Creating config file
3. Adding resources
4. Adding health check. 
5. Returning API response. 

### Usage

1. Git clone this repo
2. mvn clean install
3. java -jar target/dropwizard-basic-restapi-1.0-SNAPSHOT.jar server src/main/resources/config.yml
4. Health check : http://localhost:3000/admin/healthcheck?pretty=true
5. Demo GET API :  http://localhost:3000/api/models/1 
    
