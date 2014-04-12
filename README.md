To view the WSDL that is generated to make the deploy on JBoss and access the url: http://localhost:8080/JAXWS-Example/Calculator?wsdl.

To test the service, generate artifacts with wsimport tool that comes with the jdk as follows: 
    
    wsimport http://localhost:8080/JAXWS-Example/Calculator?wsdl -d bin -s src -keep -p br.com.fluentcode.jaxws.client.artifact

Or if you prefer to use the JAXWS-Example-StandaloneClient project.

