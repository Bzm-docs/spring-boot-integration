package ink.bzm.helloworld;

import ink.bzm.helloworld.pojo.Person;
import ink.bzm.helloworld.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/2 10:11
 */
@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	Person person; //将person自动注入进来

	@Autowired
	User user;

	@Test

	public void contextLoads() {
		System.out.println(person); //打印person信息

		System.out.println(user);
	}

}
