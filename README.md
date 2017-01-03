# Mastercard Developer API - ATM Locations - Reference Implementation - Angular/Spring-Boot #
Spring-Boot/Maven/Angular based reference implementation of Mastercard Developer API - ATM Locations 

## [Demo](https://perusworld.github.io/mcdevapi-atmlocator-refimpl-web/) ##

## Requirements ##
1. JDK 1.8+
1. Maven
1. Bower
   

## Setup Client App (optional if you want to host the sample client app) ##
This setups up the same client app that is being used in [Mastercard Developer API - ATM Locations - Reference Implementation - Angular/Express](https://github.com/perusworld/mcdevapi-atmlocator-refimpl-web)

```bash
git submodule init
git submodule update
cd  src/main/resources/ref-html
bower install
```

## Run with Remote Debug ##
```bash
set MAVEN_OPTS=-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8000
mvn -Dserver.port=3000 -Dmastercard.api.p12.path="file:///C:/path-to-p12-file" -Dmastercard.api.consumer.key="api-key" spring-boot:run
```

## Package Executable jar/war ##
```bash
mvn clean package
```

## Running the packaged jar ##
```bash
	java -jar target\spring-boot-base-0.1.war
```

## Test App ##
Open browser and goto [http://localhost:3000](http://localhost:3000)

## Test REST APIs -cURL ##
### ATMs nearby ###
```bash
curl -X POST -H "Content-Type: application/json" -H "Cache-Control: no-cache" -d '{
	"latitude": 40.737920,
	"longitude": -73.992781
}' "http://localhost:3000/atmsNearby"
```
