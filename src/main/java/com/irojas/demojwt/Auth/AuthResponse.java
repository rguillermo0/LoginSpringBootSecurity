package com.irojas.demojwt.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AuthResponse {

	String token;

	public AuthResponse() {

	}

	public AuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	//public static Object builder() {
		// TODO Auto-generated method stub,  Agregado por Guillermo, al tratar de corregir el error.
	//	return null;
	//}

}
