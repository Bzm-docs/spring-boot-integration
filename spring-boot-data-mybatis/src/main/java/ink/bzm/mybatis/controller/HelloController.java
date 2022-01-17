package ink.bzm.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/2 9:52
 */
@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World!";
	}
}

