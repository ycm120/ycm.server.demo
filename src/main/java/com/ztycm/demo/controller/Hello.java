package com.ztycm.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

	@GetMapping(value = "/test")
	public Map<String, String> test(@RequestParam("id") String id){
		Map<String, String> result = new HashMap<>();
		result.put("name", "周彤");
		result.put("id", id);
		return result;
	} 
}
