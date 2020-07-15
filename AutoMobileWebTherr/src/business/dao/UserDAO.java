package business.dao;

import java.util.List;

import model.*;


/**
 * 车主信息模块接口设计
 * @author 岩温叫
 * @since 2019-5-27
 */
public interface UserDAO {
	/**
	 * 添加车主信息
	 * @param  车主对象
	 * @return 成功返回true
	 */
	public boolean adduser(TUser user);
	
	/**
	 * 用户登录
	 * @param 用户id 用户密码
	 * @return TUser对象
	 */
	
	public TUser Userlogin(String userid,String userpwd);
	
	/**
	 * 修改车主信息
	 * @param  车主对象
	 * @return 成功返回true
	 */
	public boolean modifyuserifo(TUser user);
	/**
	 * 修改车主密码
	 * @param  车主账号
	 * @param  修改密码
	 * @return 成功返回true
	 */
	public boolean modifyuserpwd(String userid , String pwd);
	/**
	 * 查询所有车主信息
	 * @return 成功返回所有车主
	 */
	public List<TUser> queryuser(String wherecondition,
			int currentPage, int pageSize);
	
	/**
	 * 查询所有车主条数
	 * @return 成功返回所有车主
	 */
	public int getuserAmount(String wherecondition);
	
	/**
	 * 查询车主信息
	 * @param  车主账号
	 * @return 成功返回车主
	 */
	public TUser queruser(String userid);
	/**
	 * 删除车主
	 * @return 成功返回true
	 */
	public boolean deluser(String userid);
	
	/**
	 * 通过userid查询信息
	 * 
	 */
	public List<TUser> getAllusernameifo(String userid);
}
