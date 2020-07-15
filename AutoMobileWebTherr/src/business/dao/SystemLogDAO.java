package business.dao;

import java.util.List;

import model.TSystemLog;


/**
 * 系统管理日志业务接口
 * @author zhangjs
 * @version 2019-6-13
 */
public interface SystemLogDAO {

	/**
	 * 根据条件获取系统管理日志的列表
	 * @param wherecondition 组合查询条件字符串,如："userRole = '超级管理员' and userid = 'zhangjs'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<TSystemLog> getSystemLogList(
			String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的系统管理日志的数量
	 * @param wherecondition 如："userRole = '超级管理员' and userid = 'zhangjs'" 
	 * @return
	 */
	public int getSystemLogAmount(
			String wherecondition);
	
	/**
	 * 获取系统操作的类型
	 * @return
	 */
	public List<String> getOperTypes();
	
	/**
	 * 根据主键id删除日志
	 * @param id
	 * @return
	 */
	public boolean deleteLogById(String id);

    /**
     * 添加一条操作日志
     * @param record
     * @return
     */
	public Integer addLog(TSystemLog record);
    
    /**
     * 返回对应主键id的日志记录 
     * @param id
     * @return
     */
	public TSystemLog getLogById(String id);
	
}
