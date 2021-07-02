package ink.bzm.helloworld.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/2 10:27
 */
@Component //注册bean
@PropertySource(value = "classpath:user.properties")
public class User {
	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Value("${sex}")
	private String sex;

	public User() {
	}

	public User(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", sex='" + sex + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}

