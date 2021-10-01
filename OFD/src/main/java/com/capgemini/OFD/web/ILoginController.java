package com.capgemini.OFD.web;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.OFD.repository.RoleRepository;
import com.capgemini.OFD.repository.UserRepository;
import com.capgemini.OFD.domain.Login;
import com.capgemini.OFD.domain.Role;
import com.capgemini.OFD.domain.Roles;
import com.capgemini.OFD.model.SignUpRequest;




@RestController
@RequestMapping("/admin")
public class ILoginController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	PasswordEncoder encoder;
	
	@PostMapping("/signup")
	public ResponseEntity<?> userSignup(@RequestBody SignUpRequest signupRequest) {
		if(userRepository.existsByUserName(signupRequest.getUserName())){
	      return ResponseEntity.badRequest().body("Username is already taken");
	    }
	   
	    Login user = new Login();
	    Set<Role> roles = new HashSet<>();
	    user.setUserName(signupRequest.getUserName());
	    user.setPassword(encoder.encode(signupRequest.getPassword()));
	    System.out.println("Encoded password--- " + user.getPassword());
	    String[] roleArr = signupRequest.getRoles();
	    
	    if(roleArr == null) {
	      roles.add(roleRepository.findByRoleName(Roles.ROLE_USER).get());
	    }
	    for(String role: roleArr) {
	      switch(role) {
	        case "admin":
	          roles.add(roleRepository.findByRoleName(Roles.ROLE_ADMIN).get());
	          break;
	        case "user":
	          roles.add(roleRepository.findByRoleName(Roles.ROLE_USER).get());
	          break;  
	        default:
	          return ResponseEntity.badRequest().body("Specified role not found");
	      }
	    }
	    user.setRoles(roles);
	    userRepository.save(user);
	    return ResponseEntity.ok("User signed up successfully");
	}
}
