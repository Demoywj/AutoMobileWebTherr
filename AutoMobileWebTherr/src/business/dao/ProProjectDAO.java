package business.dao;

import java.util.List;

import model.*;
/**
 * 维保项目管理模块接口设计
 * @author 赵舒欣
 * @version 2019-6-27
 */
public interface ProProjectDAO {
	/**
	 * 根据条件获取维保项目的列表
	 * @param wherecondition 组合查询条件字符串,如："brandname = '大众'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<TProProject> getProProjectList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的项目的数量
	 * @param wherecondition 如："brandname = '大众' " 
	 * @return
	 */
	public int getProProjectAmount(String wherecondition);
	
	/**
	 * 添加一个项目
	 * @param user 项目对象
	 * @return 添加成功的项目编号，如<=0则表示添加失败
	 */
	public int addProProject(TProProject tp);
	
	/**
	 * 删除一个项目
	 * @param 
	 * @return 成功返回true，失败返回false
	 */
	public boolean delProProject(int projectid);
	
	/**
	 * 修改项目
	 * @return
	 */
	public boolean modiProProject(TProProject projectid);
	
	/**
	 * 根据ID brandid  返回TProProject对象
	 * @param brandid 用户名
	 * @return TProProject对象
	 */
	public TProProject getProProject (int projectid);
	
}
