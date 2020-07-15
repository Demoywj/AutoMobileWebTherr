package business.dao;

import java.util.List;


/**
 * 管理员角色业务接口
 * @author Admin y
 * @version 2019-06-13
 */
public interface AdminUserRoleDAO {
	
	/**
	 * 查询所有管理员角色类型
	 * @return
	 */
	public List getAllAdminRoles();
	
	
	public int  getAllAdminRolesAmount();
}

