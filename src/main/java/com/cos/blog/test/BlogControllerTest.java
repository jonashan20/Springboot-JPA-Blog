package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
	
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
	
	
	//http://localhost:8080/test/hello2
		@GetMapping("/test/hello2")
		public String hello2() {
			return "<h1>hello2 ggggsex</h1>";
		}
	
	
}
