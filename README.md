# Darwin Train Time Client API
Java based wrapper for the live train times API (Darwin)

#Functions implemented:

# Build instructions

`./gradlew build` - builds the project and runs the associated tests
`./gradlew tests` - runs the tests - this will confirm the service is running as expected. Any failures will indicate an update is required, the service is down, or the API token is not present/valid.

## Regenerating the client classes:

The JDK comes with a tool `wsimport`. We can generated the source files under the com directory by running the following command within the src/java directory of your project.

Reference and thanks to: https://stackoverflow.com/questions/4172118/web-service-client-given-wsdl/4172152#4172152 "Pascal Thivnet".

`wsimport -extension -keep -XadditionalHeaders https://lite.realtime.nationalrail.co.uk/OpenLDBWS/wsdl.aspx?ver=2016-02-16`

This will generate the various classes and source code required.

About the options:

- extension is used to allow extensions (the WSDL is using a non-standard SOAP 1.2 binding)
- keep is to keep generated .java sources (this is will ease the development)
- XadditionalHeaders is used to map additional WSDL headers (that are not part of the input or output contract defined in the portType operation) to method parameters (this will make invoking the service easier).



