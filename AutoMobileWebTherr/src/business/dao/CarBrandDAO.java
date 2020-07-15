package business.dao;

import java.util.List;

import model.*;
/**
 * 车辆品牌管理模块接口设计
 * @author 赵舒欣
 * @version 2019-6-27
 */
public interface CarBrandDAO {
	/**
	 * 根据条件获取车辆品牌的列表
	 * @param wherecondition 组合查询条件字符串,如："brandname = '大众'" 
	 * @param currentPage 按分页查询的当前页
	 * @param pageSize 按分页查询的每页数量
	 * @return List
	 */
	public List<TCarBrand> getCarBrandList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 根据条件获取符合条件的品牌的数量
	 * @param wherecondition 如："brandname = '大众' " 
	 * @return
	 */
	public int getCarBrandAmount(String wherecondition);
	
	/**
	 * 添加一个品牌
	 * @param user 品牌对象
	 * @return 添加成功的品牌编号，如<=0则表示添加失败
	 */
	public int addCarBrand(TCarBrand cb);
	
	/**
	 * 删除一个品牌
	 * @param 
	 * @return 成功返回true，失败返回false
	 */
	public boolean delCarBrand(int brandname);
	
	/**
	 * 修改品牌
	 * @return
	 */
	public boolean modiCarBrand(TCarBrand brandid);
	
	/**
	 * 根据ID brandid  返回TCarBrand对象
	 * @param brandid 用户名
	 * @return TCarBrand对象
	 */
	public TCarBrand getCarBrandid (int brandid);
	
	
	/**
	 * 无条件获得所有车辆品牌
	 */
	public List<TCarBrand> getCarBrandlist ();
	
}
