package business.dao;

import java.util.List;

import model.TServiceNotification;
import model.VPoRepmaiOrder;
import model.VRepmaiOrder;
import model.VServiceNotification;

			 

/**
 * 服务通知模块接口设计
 * @author 岩温叫
 * @since 2019-5-27
 */
public interface ServiceNotificationDAO {
		/**
		 * 添加服务通知
		 * @param 服务通知对象Notifica
		 */
	public boolean addServiceNotification(TServiceNotification Notifica);
		/**
		 * 修改服务通知
		 *@param 要修改的服务通知对象Notifica
		 * @return
		 */
	public boolean modifyServiceNotification(TServiceNotification Notifica);
	
		/**
		 * 删除服务通知
		 * @param serviceid 通知编号
		 * @return 
		 */
	public boolean delServiceNotification(int serviceid);
		
		/**
		 * 查询车主的所有服务通知
		 * @param userid 车主账号
		 * @return 车主的所有服务通知
		 */
	public VServiceNotification getServiceNotification(String userid);
	

	
		/**
		 * 查询所有服务通知
		 * @return 所有服务通知
		 */
	public List<VServiceNotification> getAllServiceNotification(String wherecondition, int currentPage, int pageSize);
	
	
		/**
		 * 查询所有车主维保记录
		 */
	
	public List<VPoRepmaiOrder> getVPoRepmaiOrderList(int wherecondition, int currentPage, int pageSize);
	
	
	/**
	 * 查询所有车主维保记录条数
	 */
	public int getVPoRepmaiOrderAmount(String wherecondition);
	
	/**
	 * 根据维保编号查询当前车主维保记录
	 */

	public VPoRepmaiOrder getVPoRepmaiOrder(int repmaiid);
	
	/**
	 * 根据维保编号向remark添加1
	 */

	public boolean addTRepMaiOrderremark(int repmaiid,String remark);
	
	
	/**
	 * 根据服务通知编号获得服务通知对象
	 */
	public TServiceNotification getTServiceNotification(int serviceid);
	
}
