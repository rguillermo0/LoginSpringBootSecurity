package com.irojas.demojwt.Auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
//@RequiredArgsConstructor
public class AuthController {
    
	//@Autowired
    //AuthService authService;
    //private final AuthService authService;
    
//    @PostMapping(value = "login")
//    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request)
//    {
//        return ResponseEntity.ok(authService.login(request));
//    }

	@PostMapping(value = "login")
	public String login()
	{
		return	"Login from public endpoint";
	}
	
	
//    @PostMapping(value = "register")
//    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request)
//    {
//        return ResponseEntity.ok(authService.register(request));
//    }
	
	@PostMapping(value = "register")
	public String register()
	{
		return "Register from public endpoint";
	}
}
