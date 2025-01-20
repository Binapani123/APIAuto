package waytocreatbody;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

public class CreatingmethodUsingJSONObject {
	@Test
	
	void PostusingJsinLibrary() {
	}
	{
		JSONObject js=new JSONObject();
		js.put("name", "morpheus");
		js.put("job", "leader");
		
		given()
		.contentType("application/json")
		.body(js)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
}
}