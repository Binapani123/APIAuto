package waytocreatbody;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

public class CreatingBodyUsingPOJO {
	@Test
	

	void PostusingPojo() {
	
	pojo_postRequest poj=new pojo_postRequest();	
	poj.setName("morpheus");
	poj.setJob("leader");
	
		given()
		.contentType("application/json")
		.body(poj)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();

}
}