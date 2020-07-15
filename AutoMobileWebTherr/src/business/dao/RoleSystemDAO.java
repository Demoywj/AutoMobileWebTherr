package business.dao;

import model.TRol_SystemModel;

public interface RoleSystemDAO {
	/**
	 * 角色权限管理接口
	 * @author Administrator
	 *
	 */
	
	
	/**
	 * 添加菜单权限
	 * @param modelByPower TSystemModelByPower对象
	 * @return boolean 成功返回true， 失败返回false
	 */
	public int addSystemModelByPower(TRol_SystemModel modelByPower);
	
	/**
	 * 成功授权
	 * @param powerid 
	 * @return
	 */
	public boolean modifyRoleSystemSuccess(int powerid);
	
	

	/**
	 * 取消授权
	 * @param powerid 
	 * @return
	 */
	public boolean modifyRoleSystemCancelled(int powerid);
	
	
	/**
	 * 根据菜单编号删除菜单权限
	 * @param sysid 菜单编号
	 * @return boolean 成功返回true， 失败返回false
	 */
	public boolean deleteSystemModelBySysid(int sysid);
	
}
