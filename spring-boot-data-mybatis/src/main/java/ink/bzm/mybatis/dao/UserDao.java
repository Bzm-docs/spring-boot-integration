package ink.bzm.mybatis.dao;

import ink.bzm.mybatis.pojo.User;

import java.util.List;

/**
 * @author: buzhengmiao
 * @time: 2021/7/5 16:11
 */
public interface UserDao {
	List<User> findAll();

	User findById(Long id);

	void save(User user);

	void update(User user);

	void delete(Long id);
}
