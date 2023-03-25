## Authors
* Name:  Email:
* Name:  Email:

## Explanations

## How to use this template 
This is the template for a project where front-end and back-end are separated.
The front-end is a React application, the back-end is a Java Web application 
including a Servlet for REST API endpoints.

The template depends on:
* your local installation of tomcat, this template uses
tomcat 9.0.45 that can be downloaded from https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.45/bin/apache-tomcat-9.0.45.tar.gz.
In order to point to your own installation of tomcat, edit configuration in IntelliJ change the application server.
* your local installation of nodejs, this template is based on nodejs v18.15.0 (npm 9.5.0). You can download it from https://nodejs.org/en/download.
* your local installation of java (check File->Project Structure->Platform SDK). You can add SDK from IntelliJ: File->Project Structure->Platform Settings-> +). 
This template is based on version 19, you can download it from https://jdk.java.net/19/).
The template includes:
* a Java Web template with an empty Servlet to implement your server side REST API under the src/main/java folder
* a React template under the reac-client folder, with an initialized npm project.

### In order to run your exercise you:
* run the server side; with IntelliJ configuration at the upper right (or open the terminal and run `/<path to your tomcat>/bin/catalina.sh run`)
* run the client side: open the terminal: `cd react-client`, `npm install`,  run with the command `npm start`

Then browse:
* your react client at http://localhost:3000
* your server will be available at http://localhost:8080/api/highscores (you have of course to implement the REST API).
Note that you should never specify the host and port in your React code! (use 'api/' instead of 'http://localhost:8080/api/')

