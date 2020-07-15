package business.dao;

import java.util.List;

import model.TSubscribe;
import model.TSubscribeContent;
import model.VSubscribe;

/**
 * 预约信息模块接口设计
 * @author 岩温叫
 * @since 2019-5-27
 */
public interface SubscribeDAO {
	/**
	 * 添加预约信息
	 * @param 预约对象
	 */
	public boolean addsubscribe(TSubscribe subscribe);
	
	/**
	 * 修改预约状态
	 * @param 预约编号  预约状态
	 */
	public boolean modifysubscribe(int subscribeid,String subscribestate);
	
	/**
	 * 查询用户的所有预约
	 * @param 用户账号
	 */
	public List<VSubscribe> getsubscribe(String userid,String subscribestate);
	
	
	/**
	 * 查询所有预约
	 */
	public List<VSubscribe> getAllsubscribe();
	
	/**
	 * 查询所有预约分页
	 */
	public List<VSubscribe> getVSubscribeList(String wherecondition, int currentPage, int pageSize);
	
	
	/**
	 * 根据预约编号获取预约项目内容
	 */
	
	public List<TSubscribeContent> getSubscribeContentList(int subscribeid);
}
