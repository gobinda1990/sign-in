package comtax.gov.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import ch.qos.logback.classic.Logger;
import comtax.gov.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/auth")	
public class AuthController {
	

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody User user) {
		//logger.info("enter into authController:--");
		if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
			return ResponseEntity.ok("Login Successful for " + user.getUsername());
		}
		return ResponseEntity.status(401).body("Login Failed");
	}

}
