package ink.bzm.springbootredis;

import ink.bzm.springbootredis.service.impl.RedisServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class SpringBootRedisApplicationTests {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	RedisServiceImpl redisService;

	@Test
	public void contextLoads() {
		redisTemplate.boundValueOps("new_key4").set("new_value4");
		stringRedisTemplate.boundValueOps("new_key3").set("new_value3");
	}

	@Test
	void Test(){
		Object execute = redisTemplate.execute(new RedisCallback() {

			@Override
			public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
				Map<String, Object> map = new HashMap<>();
				map.put("memory", redisConnection.info("memory").get("used_memory"));
				return map;
			}
		});
		System.out.println(execute);
	}
}
