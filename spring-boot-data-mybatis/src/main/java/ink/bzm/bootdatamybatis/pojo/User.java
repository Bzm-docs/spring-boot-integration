package ink.bzm.bootdatamybatis.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: buzhengmiao    docs.bzm.ink
 * @time: 2021/7/5 16:11
 */
@Data
@ToString
public class User implements Serializable {

	private Long id;
	private String username;
	private String password;
	private Date createTime;
}
