package com.DTOFactory;

import com.auto.UserRequestDTO;
import com.auto.UserResponseDTO;

public interface DTOFactory {
	UserRequestDTO UsrRequestDTO(String name, String job);
	UserResponseDTO usrResponseDTO(String name,String job,String id,String createdAt);

}
