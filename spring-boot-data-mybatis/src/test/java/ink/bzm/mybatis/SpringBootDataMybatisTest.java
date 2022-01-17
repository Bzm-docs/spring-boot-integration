package ink.bzm.mybatis;


import ink.bzm.mybatis.dao.UserDao;
import ink.bzm.mybatis.pojo.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/5 10:56
 */
@SpringBootTest
public class SpringBootDataMybatisTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	UserDao userDao;

	@Test
	public void testFindAll() {
		List<User> list = userDao.findAll();
		list.forEach(user -> {
			logger.info("user={}", user);
		});
	}

	@Test
	public void testFindById() {
		logger.info("user={}", userDao.findById(1L));
	}

	@Test
	public void testSave() {
		User user = new User();
		user.setUsername("测试");
		user.setPassword("123");
		user.setCreateTime(new Date());
		userDao.save(user);
		testFindAll();
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(1L);
		user.setUsername("测试呀");
		userDao.update(user);
		testFindAll();
	}

	@Test
	public void delete() {
		userDao.delete(3L);
		testFindAll();
	}
}
