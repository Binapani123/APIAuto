package com.DTO1;

import com.DTOFactory.DTOFactory;
import com.auto.UserResponseDTO;
import com.auto.UserRequestDTO;

public class DTOFactoryimp implements DTOFactory {
	
	public UserRequestDTO UsrRequestDTO(String name, String job) {
		UserRequestDTO userRequestDTO = new UserRequestDTO();
		userRequestDTO.setJob(name);
		userRequestDTO.setJob(job);
		return userRequestDTO;
		
	}

	public UserResponseDTO usrResponseDTO(String name, String job, String id, String createdAt) {
		UserResponseDTO userResponseDTO = new UserResponseDTO();
		userResponseDTO.setName(name);
		userResponseDTO.setJob(job);
		userResponseDTO.setId(id);
		userResponseDTO.setCreatedAt(createdAt);
		return userResponseDTO;
	}

}
