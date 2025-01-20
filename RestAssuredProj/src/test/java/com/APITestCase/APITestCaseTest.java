package com.APITestCase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.DTO1.DTOFactoryimp;
import com.auto.UserRequestDTO;

import org.testng.annotations.Test;

public class APITestCaseTest {
	
	
	@Test
	public void createUserTest() {
		DTOFactoryimp factory = new DTOFactoryimp();
		UserRequestDTO usrRequestDTO = factory.UsrRequestDTO("morpheus","leader");
		assertEquals("morpheus", usrRequestDTO.getName());
		
		
		
		
		
	}
	

}
