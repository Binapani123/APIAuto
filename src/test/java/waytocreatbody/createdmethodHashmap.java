package waytocreatbody;

import java.util.HashMap;

import org.testng.annotations.Test;

import net.minidev.json.JSONObject;

import  static io.restassured.RestAssured.*;
 import  static io.restassured.matcher.RestAssuredMatchers.*;
 import  static org.hamcrest.Matchers.*;
public class createdmethodHashmap {
	//creat request body using Hashmap
	@Test
	void PostusingHashMap() {
	}
	{
		HashMap hm=new HashMap();
		hm.put("name", "morpheus");
		hm.put("job", "leader");
		
		given()
		.contentType("application/json")
		.body(hm)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
		
		
	}
	
		
	
	}
	

