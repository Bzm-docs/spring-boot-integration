package ink.bzm.helloworld.config;

import ink.bzm.helloworld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/2 10:25
 */
@Configuration(proxyBeanMethods = true)		///告诉SpringBoot这是一个配置类
public class MyConfig {

	@Bean	//给容器中添加组件
	public HelloService helloService() {
		return new HelloService();
	}

}
