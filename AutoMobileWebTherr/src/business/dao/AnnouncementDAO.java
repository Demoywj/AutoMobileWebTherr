package business.dao;

import java.util.List;

import model.TAnnouncement;

/**
 * 公告管理模块接口设计
 * @author 岩温叫
 * @version 2019-6-28
 */
public interface AnnouncementDAO {
	/**
	 * 添加公告
	 * @param 公告announ对象
	 * @return
	 */
	public boolean addAnnouncement(TAnnouncement announ);
	
	/**
	 * 修改公告
	 * @param 公告announ对象
	 * @return
	 */
	public boolean modifyAnnouncement(int antid,String antitle , String ancontent);
	
	/**
	 * 删除公告
	 *  @param 公告id编号
	 * @return
	 */
	public boolean delAnnouncement(int antid);
	/**
	 * 查询单条公告记录
	 * @param 公告id编号
	 */
	public TAnnouncement getAnnouncement(String antid);
	
	/**
	 * 查询所有公告记录
	 * 
	 */
	public List<TAnnouncement> getAllAnnouncement();

	/**
	 * 查询所有公告记录分页加条件
	 * @param wherecondition
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<TAnnouncement> getAnnouncementList(
			String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 查询所有公告条数
	 * @return 成功返回所有公告条数
	 */
	public int getAnnouncementAmount(String wherecondition);

}
