package com.example.provincycricket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "profile Error")
public class ProfileException extends Exception{
	
	public ProfileException(String msg) {
		super();
		System.out.println("ERROR - "+msg);
		//return "msg";
	}
}
