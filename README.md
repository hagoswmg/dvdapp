# REST with Jersey and Spring Demo App

Spring is used so that classes of Spring beans declared using XML-based configuration or auto-wire-based configuration 
will be automatically registered if such classes are root resource classes or provider classes.
 
## Dependency
Jersey Version 1.9
Spring Version 3.2.4


The app mocks DVD library catalog

URL Mapping
- Base URL from pom.xml --> localhost:8080/dvdapp
- Prefix from web.xml   --> /webapi/*
- Prefix from controller --> /resources and /dvds

Full Path
- http://localhost:8080/dvdapp/webapi/sayhello
-- returns hello world
- http://localhost:8080/dvdapp/webapi/dvds
-- return a list of DVDs from the catalog


## Swagger Documentation