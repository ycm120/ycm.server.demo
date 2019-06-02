package com.ztycm.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/hello")
@Api(tags="test controller")
public class Hello {

	@ApiOperation(value="@value注解的方式获取配置文件信息", notes="@value注解的方式获取配置文件信息")
	@GetMapping(value = "/test")
	public Map<String, String> test(@RequestParam("id") String id){
		Map<String, String> result = new HashMap<>();
		result.put("name", "周彤");
		result.put("id", id);
		return result;
	} 
}
