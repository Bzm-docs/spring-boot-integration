package ink.bzm.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/2 9:47
 */
/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

	public static void main(String[] args) {

		// Spring应用启动起来
		SpringApplication.run(HelloWorldMainApplication.class,args);
	}
}
