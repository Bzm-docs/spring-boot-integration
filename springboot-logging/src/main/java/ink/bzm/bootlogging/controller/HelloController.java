package ink.bzm.bootlogging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/5 8:51
 */
@Controller
@Slf4j
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		log.info("hello info");
		log.debug("hello debug");
		return "Hello World!";
	}
}
