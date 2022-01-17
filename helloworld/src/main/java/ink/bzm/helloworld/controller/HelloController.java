package ink.bzm.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/2 9:52
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
}

