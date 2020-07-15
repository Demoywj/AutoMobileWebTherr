package business.dao;

import java.util.List;

import model.*;
/**
 * 车辆产品管理模块接口设计
 * @author 赵舒欣
 * @version 2019-6-27
 */
public interface ProContentDAO {
	/**
	 * 根据条件获取车辆产品的列表
	 * @param wherecondition 组合查询条件字符串,如："typename = '宝马三系'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<VProject> getProContentList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的产品的数量
	 * @param wherecondition 如："brandname = '宝马' " 
	 * @return
	 */
	public int getProContentAmount(String wherecondition);
	
	/**
	 * 添加一个产品
	 * @param tt 产品对象
	 * @return 添加成功的产品编号，如<=0则表示添加失败
	 */
	public int addProContent(TProContent procontentid);
	
	/**
	 * 删除一个产品
	 * @param 
	 * @return 成功返回true，失败返回false
	 */
	public boolean delProContent(int procontentid);
	
	/**
	 * 修改产品
	 * @return
	 */
	public boolean modiProContent(int procontentid ,String procontentname,Double proprice,Double prohour,Double pronumprice);
	
	/**
	 * 根据ID typeid  返回TCarBrand对象
	 * @param typeid 用户名
	 * @return TCarBrand对象
	 */
	public TProContent getprocontentid (int procontentid);
	
	/**
	 * 返回所有procolumnname的值
	 * @return
	 */
	public List getAllprocolumnname(int procolumnid);
	
}
