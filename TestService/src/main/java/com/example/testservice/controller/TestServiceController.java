package com.example.testservice.controller;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestServiceController {
	
	@GetMapping(value = "testfunction")
	public String TestFunction() {
		//String response;
		StringBuilder response = new StringBuilder();
		try {
			URL url = new URL("http://localhost:8082/provincycricket/profile/test");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setDoOutput(true);
			InputStream out = conn.getInputStream();
			InputStreamReader isw = new InputStreamReader(out);
			int data = isw.read();
			
	        while (data != -1) {
	            char current = (char) data;
	            data = isw.read();
	            response.append(current);
	        }
		}
		catch (Exception e) {
			return e.toString();
		}
		return response.toString();
	}

	@GetMapping(value = "testleaderboardx")
	public String TestFunction1() {
		//String response;
		StringBuilder response = new StringBuilder();
		try {
			URL url = new URL("http://localhost:8082/provincycricket/profile/leaderboard");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setDoOutput(true);
			InputStream out = conn.getInputStream();
			InputStreamReader isw = new InputStreamReader(out);
			int data = isw.read();
			
	        while (data != -1) {
	            char current = (char) data;
	            data = isw.read();
	            response.append(current);
	        }
		}
		catch (Exception e) {
			return e.toString();
		}
		/*
		 * catch (Exception e) { // TODO: handle exception }
		 */		return response.toString();
	}

}
