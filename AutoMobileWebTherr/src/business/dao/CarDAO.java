package business.dao;

import java.util.List;

import model.TCar;
import model.TUser;
import model.VCar;


/**
 * 车主车辆管理模块接口设计
 * @author 赵舒欣
 * @since 2019-6-26
 */
public interface CarDAO {
	
	/**
	 *  车主车辆信息添加
	 * @param carid  车辆编号
	 * @return  boolean  添加成功返回true 失败返回false
	 */
	public boolean addCarinfo(TCar carid);
	
	
	/**
	 * 删除车主车辆信息
	 * @param carid  车牌号
	 * @return  boolean  删除成功返回true 失败返回false
	 */
	
	public boolean deleteCar(String carnum);
	
	/**
	 * 查询属于车主的所有车辆信息
	 * @param 车主账号
	 * @return 车主对象列表  List<VCar>，
	 */
	
	public List<VCar> getVCar(String userid);
	
	/**
	 * 查询属于所有车辆信息
	 * @return 车主对象列表  List<VCar>，按reviewed降序排序
	 */
	
	public List<VCar> getTCar();
	
	/**
	 *  车主车辆信息修改
	 * @param carid  车辆编号
	 * @return  boolean  添加成功返回true 失败返回false
	 */
	public boolean modifyCarinfo(TCar carid);
	
	/**
	 * 查询车辆信息
	 * @param carid 车辆编号
	 * @return
	 */
	public List<TCar> getTCar(int carid);
	
}
