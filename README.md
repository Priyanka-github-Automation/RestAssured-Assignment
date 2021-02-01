# API Automation using RestAssured
## Requirement

1. Use any 2 methods(Get, and Delete) from end-points listed in
http://dummy.restapiexample.com/
2. Perform assertions for 
   - Get & Delete - Status code to be Successful.
   - Get - Return specific Employee details(Any).
   - Delete - "message": "successfully! deleted Records".

## Implementation details

- Automated the above requirement using RestAssured library, Maven project and TestNG framework.
- Passed the employee id whose details need to be retrieved and whose record needs to be deleted as parameter through TestNG.xml file.

## How to Run

* https://www.elastic.co/downloads/elasticsearch[Download] and unpack the Elasticsearch official distribution.
* Run `bin/elasticsearch` on Linux or macOS. Run `bin\elasticsearch.bat` on Windows.
* Run `curl -X GET http://localhost:9200/` to verify Elasticsearch is running.
