package validations.API;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author priyankakodeboina
 *
 */
public class ValidateAPImethods {
	
	
	//method to send get request
	public Response getRequest(String employeeId)
	{
		Response response =
		given()
			.baseUri("http://dummy.restapiexample.com/")
			.basePath("api/v1/employee")
			.pathParam("employeeId", employeeId)
			.log().all()
		.when()
			.get("/{employeeId}")
		.then()
			.log().all()
			.statusCode(200)
			.extract().response();
		
		return response;
	}
	
	//method to send delete request
	public Response deleteRequest(String employeeId)
	{
		Response response =
		given()
			.baseUri("http://dummy.restapiexample.com/")
			.basePath("api/v1/delete")
			.pathParam("employeeId", employeeId)
			.log().all()
		.when()
			.delete("/{employeeId}")
		.then()
			.log().all()
			.statusCode(200)
			.extract().response();
		
		return response;
	}
	
	//method to extract json response
	public String extractJson(Response resp, String attribute)
	{
		String response = resp.asString();
		JsonPath js = new JsonPath(response);
		return js.getString(attribute);
		
	}
	
	@Parameters({"employeeId"})
	@Test(priority=1)
	public void validateGetMethod(String employeeId)
	{
		//calling the Get request with employee id as parameter
		Response response = getRequest(employeeId);
		
		//extracting the value of message attribute from json response
		String messageValue = extractJson(response, "message");
		
		//Validating if message value received is as expected
		Assert.assertEquals(messageValue,"Successfully! Record has been fetched.");
	}
	
	@Parameters({"employeeId"})
	@Test(priority=2, retryAnalyzer = Utilities.RetryAnalyzer.class)
	public void validateDeleteMethod(String employeeId)
	{
		//calling the Delete request with employee id as parameter
		Response response = deleteRequest(employeeId);
				
		//extracting the value of message attribute from json response
		String messageValue = extractJson(response, "message");
				
		//Validating if message value received is as expected
		Assert.assertEquals(messageValue,"Successfully! Record has been deleted");
	}

}
