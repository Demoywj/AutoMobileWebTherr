package business.dao;

import java.util.List;

import model.TAdminUser;
import model.VAdminUser;

/**
 * 管理端管理员业务接口
 * @author Admin y
 * @version 2019-06-13
 */
public interface AdminUserDAO {

	/**
	 * 根据条件获取管理员用户的列表
	 * @param wherecondition 组合查询条件字符串,如："userRole = '超级管理员' and userid = 'zhangjs'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<VAdminUser> getAdminUserList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的管理员用户的数量
	 * @param wherecondition 如："userRole = '超级管理员' and userid = 'zhangjs'" 
	 * @return
	 */
	public int getAdaminUserAmount(String wherecondition);
	
	/**
	 * 添加一个管理员
	 * @param user 管理员对象
	 * @return 添加成功的管理员编号，如<=0则表示添加失败
	 */
	public int addAdminUser(TAdminUser user);
	
	/**
	 * 删除一个管理员
	 * @param userid 管理员id
	 * @return 成功返回true，失败返回false
	 */
	public boolean delAdminUser(String userid);
	
	/**
	 * 用户登录
	 * @param userid
	 * @param pwd
	 * @return
	 */
	
	public VAdminUser loginUser(String userid,String pwd);
	
	/**
	 * 修改管理用户资料
	 * @param userid
	 * @param realname
	 * @param mobile
	 * @return
	 */
	
		public boolean modifuser(String userid,String realname,String mobile);
	
	
}
