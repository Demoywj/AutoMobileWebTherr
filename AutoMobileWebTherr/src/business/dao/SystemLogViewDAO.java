package business.dao;

import java.util.List;

import model.TSystemLog;
import model.VAdminUser;

/**
 * 日志业务接口
 * @author Administrator
 *
 */
public interface SystemLogViewDAO {
	/**
	 * 根据条件获取管理员用户的列表
	 * @param wherecondition 组合查询条件字符串,如："userRole = '超级管理员' and userid = 'zhangjs'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<TSystemLog> getSystemLogList(
			String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的管理员用户的数量
	 * @param wherecondition 如："userRole = '超级管理员' and userid = 'zhangjs'" 
	 * @return
	 */
	public int getSystemLogAmount(
			String wherecondition);
}
