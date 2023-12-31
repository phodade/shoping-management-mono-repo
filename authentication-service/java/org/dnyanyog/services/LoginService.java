package org.dnyanyog.services;

import java.util.List;

import org.dnyanyog.dto.LoginRequest;
import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.dto.User;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	UsersRepository userRepo;
	
	public LoginResponse validateUser(LoginRequest loginRequest)
	{
		LoginResponse response=new LoginResponse();
		
		List<User>liUser=userRepo.findByUsernameAndPassword(loginRequest.getUsername(),loginRequest.getPassword());
		
		if(liUser.size()==1)
		{
			response.setStatus("success");
			response.setMessage("Login successful");
			
		}
		else
		{
			response.setStatus("fail");
			response.setMessage("Login Failuer");
		}
		return response;
	}

}
