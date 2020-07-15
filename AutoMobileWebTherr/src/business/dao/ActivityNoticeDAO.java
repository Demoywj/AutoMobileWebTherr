package business.dao;

import java.util.List;

import model.TActivityNotice;
import model.TArticle;

/**
 * 活动通知管理模块接口设计
 * @author 岩温叫
 * @version 2019-5-27
 */
public interface ActivityNoticeDAO {
	/**
	 * 添加活动通知管理
	 * @param 活动通知管理article对象
	 * @return
	 */
	public boolean addAcivityNotice(TActivityNotice article);
	
	/**
	 * 修改活动通知管理
	 * @param 活动通知管理article对象
	 * @return
	 */
	public boolean modifyAcivityNotice(int userid,String realname,String userphone,	String articlephoto);
	
	/**
	 * 删除活动通知管理
	 *  @param 活动通知管理id编号
	 * @return
	 */
	public boolean delAcivityNotice(int articleid);
	/**
	 * 查询单条活动通知管理记录
	 * @param 活动通知管理id编号
	 */
	public TActivityNotice getAcivityNotice(int articleid);
	
	/**
	 * 查询所有活动通知管理记录
	 * 
	 */
	public List<TActivityNotice> getAllAcivityNotice();
	
	
	
	/**
	 * 查询所有活动记录分页加条件
	 * @param wherecondition
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<TActivityNotice> getAcivityNoticeList(
			String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 查询所有活动条数
	 * @return 成功返回所有文章条数
	 */
	public int getAcivityNoticeAmount(String wherecondition);
	
}
