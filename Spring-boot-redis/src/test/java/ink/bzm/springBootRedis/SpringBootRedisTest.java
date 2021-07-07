package ink.bzm.springBootRedis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/7 10:58
 */
@SpringBootTest
public class SpringBootRedisTest {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void contextLoads() {
		redisTemplate.boundValueOps("new_key4").set("new_value4");
		stringRedisTemplate.boundValueOps("new_key3").set("new_value3");
	}
}
