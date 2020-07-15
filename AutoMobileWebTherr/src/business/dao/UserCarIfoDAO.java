package business.dao;

import java.util.List;

import model.*;
/**
 * 车辆车主车辆信息管理模块接口设计
 * @author 赵舒欣
 * @version 2019-6-27
 */
public interface UserCarIfoDAO {
	/**
	 * 根据条件获取车主车辆信息的列表
	 * @param wherecondition 组合查询条件字符串,如："typename = '宝马三系'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<VCar> getUserCarIfoList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的车辆的数量
	 * @param wherecondition 如："brandname = '宝马' " 
	 * @return
	 */
	public int getUserCarIfoAmount(String wherecondition);
	
	/**
	 * 添加一个车主车辆信息
	 * @param tt 车主车辆信息对象
	 * @return 添加成功的车主车辆信息编号，如<=0则表示添加失败
	 */
	public int addUserCarIfo(TCar carid);
	
	/**
	 * 删除一个车主车辆信息
	 * @param 
	 * @return 成功返回true，失败返回false
	 */
	public boolean delUserCarIfo(int carid);
	
	/**
	 * 修改车主车辆信息
	 * @return
	 */
	public boolean modiUserCarIfo(TCar carid);
	
	/**
	 * 根据ID typeid  返回TPartifo对象
	 * @param typeid 用户名
	 * @return TPartifo对象
	 */
	public TCar getUserCarIfo (int carid);
	
	/**
	 * 通过userid查询车辆信息
	 * 
	 */
	public List<VCar> getAllusernameifo(String userid);
	/**
	 * 通过userid查询车辆信息
	 * 
	 */
	public List<VCar> getAllusercarifo(String userid);
	/**
	 * 通过userid查询车辆维保记录
	 * 
	 */
	public List<TRepMaiOrder> getusercarRepmaiOrder(String userid);
	/**
	 * 通过repmaiid查询车辆维保记录详细
	 * 
	 */
	public List<TInventory> getusercarinventory(int repmaiid);
}
