package business.dao;

import java.util.List;

import model.*;
/**
 * 车辆配件管理模块接口设计
 * @author 赵舒欣
 * @version 2019-6-27
 */
public interface PartifoDAO {
	/**
	 * 根据条件获取车辆配件的列表
	 * @param wherecondition 组合查询条件字符串,如："typename = '宝马三系'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<VVehice> getPartifoList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的配件的数量
	 * @param wherecondition 如："brandname = '宝马' " 
	 * @return
	 */
	public int getPartifoAmount(String wherecondition);
	
	/**
	 * 添加一个配件
	 * @param tt 配件对象
	 * @return 添加成功的配件编号，如<=0则表示添加失败
	 */
	public int addPartifo(TPartifo partid);
	
	/**
	 * 删除一个配件
	 * @param 
	 * @return 成功返回true，失败返回false
	 */
	public boolean delPartifo(int partid);
	
	/**
	 * 修改配件
	 * @return
	 */
	public boolean modiPartifo(int partid ,String partname,String specification, Double partprice,String partphoto);
	
	/**
	 * 根据ID typeid  返回TPartifo对象
	 * @param typeid 用户名
	 * @return TPartifo对象
	 */
	public TPartifo getPartifo (int partid);
	
	/**
	 * 返回所有configname的值
	 * @return
	 */
	public List getAllconfigname(int typeid);
	
	
	/**
	 * 根据车辆类型查车辆部件信息
	 */
	public List getConfigPartifolist(int configid);
}
