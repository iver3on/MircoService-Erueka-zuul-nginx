
package me.zhangwenbo.dao;

/**
@author  iver3on 
@date 创建时间：2016年12月2日 下午6:06:35 * 
@version 1.0 * 
 */
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import me.zhangwenbo.bean.User;

public interface UserDao extends JpaRepository<User, Integer> {

	/**
	 * @param string
	 * @return
	 */

	List<User> findByName(String userName);
	

	/**
	 * @param string
	 * @param string2
	 * @return
	 */
	List<User> findByNameAndPassword(String string, String string2);

	/**
	 * @param exampl
	 * @param pageable
	 * @return
	 */
	Page<User> findByName(String userName, Pageable pageable);

}
