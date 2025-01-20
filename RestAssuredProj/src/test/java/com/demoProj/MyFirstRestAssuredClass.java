package com.demoProj;
/*
given()
content type,add auth,set headerers..

when()
post,get,put.delete

then()
validate status code,extract response

*/

import  org.testng.annotations.Test;

import io.restassured.path.json.config.JsonPathConfig;

import static io.restassured.RestAssured.*;
import  static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class MyFirstRestAssuredClass {
	int id;
	
	@Test
	void getUsers()
	{
	
		
		when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))//EqualTo mean expected page
		.log().all();
		
	}
	@Test
	void creatUsers()
	{
		
		
	HashMap hm=new HashMap();
	hm.put("name","gudi");
	hm.put("job","trainer");
	
		id=given()
		.contentType("application/json")
		.body(hm)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		//.then()
		//.statusCode(201)
		//.log().all();
		
	}
	@Test
	void updateUsers()
	{
		HashMap hm=new HashMap();
		hm.put("name","baba");
		hm.put("job","teacher");
		
			given()
			.contentType("application/json")
			.body(hm)
			
			.when()
			.put("https://reqres.in/api/users/"+id)
			
			
			.then()
			.statusCode(200)
			.log().all();
			
			
	}
	
	@Test
	void deleteUsers()
	{
		given()
		
		.when()
		.delete("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(204)
		.log().all();
	}
	
	
	
}