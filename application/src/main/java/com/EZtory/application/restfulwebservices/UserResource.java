package com.EZtory.application.restfulwebservices;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserResource {
	
	
	@Autowired
	private UserJPARepository userJPARepository;
	
	@PostMapping("/users/signin")
	public User getAllUser(@RequestBody User userX){
		List<User> userList= userJPARepository.findAll();
		User userData=null;
		if(userList!=null) {
			for(int i=0;i<userList.size();i++) {
				User user=userList.get(i);
				if(user.getUsername().equals(userX.getUsername()) && user.getPassword().equals(userX.getPassword()))
				{
					userData=user;
					break;
				}
				
			}
		}
		return userData;
		
	}
	
	@PostMapping("/users/signup")
	public ResponseEntity<Void> createUser(@RequestBody User userX){
		System.out.println(userX.toString());
		 
		userJPARepository.save(userX);
		return ResponseEntity.noContent().build();
	
	}
}
