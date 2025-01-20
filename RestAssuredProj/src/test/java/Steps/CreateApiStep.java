package Steps;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
public class CreateApiStep {

	@Test(enabled = false)
	public void getcall()
	{
		RestAssured.baseURI ="https://reqres.in";
		
		Response response = given().
		                    when().get("/api/users?page=2");
		response.then().log().all();
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		assertEquals(200, response.getStatusCode());
		
	}
	
	@Test
	public void postcall() {
		
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put( "name", "morpheus");
		jsonObject.put("job", "leader");
		
		
		
		String jsonString = jsonObject.toJSONString();
		System.out.println(jsonString);
		
		RestAssured.baseURI="https://reqres.in";
		
		Response response = given().body(jsonString)
		                     .when().post("/api/users");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		assertEquals(201, statusCode);
	}
	

}
