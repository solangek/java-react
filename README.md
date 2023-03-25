<h2>Students</h2>
* Name:  Email:
* Name:  Email:

<h2>Explanations</h2>

<h2>How to use this template </h2>
This is the template for your exercise. 

It depends on your local installation of tomcat, this template uses
tomcat 9.0.45 that can be downloaded from https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.45/bin/apache-tomcat-9.0.45.tar.gz.
In order to point to your own installation of tomcat, edit configuration in IntelliJ change the application server.

The template includes:
* a Java Web template with an empty Servlet to implement your server side
* a React template under the reac-client folder, with an initialized npm project.

In order to run your exercise you:
* run the server side with IntelliJ configuration or open the terminal and run `mvn tomcat:run`
* open the terminal, cd react-client, run the client side with the command `npm start`

Browse:
* your client at http://localhost:3000
* your server at http://localhost:8080/api/highscores (you have of course to implement the REST API)

