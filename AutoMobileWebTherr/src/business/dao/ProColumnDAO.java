package business.dao;

import java.util.List;

import model.*;
/**
 * 车辆类型管理模块接口设计
 * @author 赵舒欣
 * @version 2019-6-27
 */
public interface ProColumnDAO {
	/**
	 * 根据条件获取车辆类型的列表
	 * @param wherecondition 组合查询条件字符串,如："typename = '宝马三系'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<VProColumn> getProColumnList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的类型的数量
	 * @param wherecondition 如："brandname = '宝马' " 
	 * @return
	 */
	public int getProColumnAmount(String wherecondition);
	
	/**
	 * 添加一个类型
	 * @param tt 类型对象
	 * @return 添加成功的类型编号，如<=0则表示添加失败
	 */
	public int addProColumn(TProColumn procolumnid);
	
	/**
	 * 删除一个类型
	 * @param 
	 * @return 成功返回true，失败返回false
	 */
	public boolean delProColumn(int procolumnid);
	
	/**
	 * 修改类型
	 * @return
	 */
	public boolean modiProColumn(int procolumnid ,String procolumnname,String procolumnpicture);
	
	/**
	 * 根据ID typeid  返回TCarBrand对象
	 * @param typeid 用户名
	 * @return TCarBrand对象
	 */
	public TProColumn getprocolumnid (int procolumnid);
	
	/**
	 * 显示项目名称
	 * @return
	 */
	public List getAllProColumn();
	
}
