package ink.bzm.mybatis;


import ink.bzm.mybatis.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	public void testFindById(){
		logger.info("user={}");
	}
}
