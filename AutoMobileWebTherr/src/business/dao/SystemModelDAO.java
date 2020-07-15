package business.dao;

import java.util.List;

import model.TSystemModel;
import model.VRoleSystemModel;


/**
 * 系统菜单管理业务类
 * @author zhangjs
 *
 */
public interface SystemModelDAO {
	
	/**
	 * 获取网站所有的菜单项列表
	 * @return
	 */
	public List<TSystemModel> getTSystemModelList(String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 查询所有评论条数
	 * @return 成功返回所有文章条数
	 */
	public int getTSystemModelAmount(String wherecondition);
	
	
	/**
	 * 按照角色选择获取对应的菜单项列表
	 * @param roleid
	 * @return List<VRoleSystemModel>
	 */
	public List<VRoleSystemModel> getSystemModelByRole(int roleid); 

	public int addSystemModel(TSystemModel TSystem);
	
	
	/**
	 * 按照深度（层级）、所属菜单编号（父id）查询菜单TSystemModel
	 * @param deepth
	 * @param parentid
	 * @return
	 */
	public List<TSystemModel> getTSystemModelByDeepthParentid(int deepth, int parentid); 
	
	
	/**
	 * 根据菜单项编号查询TSystemModel对象
	 * @param systemModelid 菜单项编号id
	 * @return TSystemModel
	 */
	public TSystemModel getTSystemModelById(int systemModelid);
	
	
	/**
	 * 修改菜单项
	 * @param systemModel TSystemModel对象
	 * @return boolean 成功返回true， 失败返回false
	 */
	public boolean updateSystemModel(TSystemModel systemModel);
	
	

	/**
	 * 根据菜单项编号删除TSystemModel对象(非物理删除，即把isdelete改为true)
	 * @param systemModelid 菜单项编号id
	 * @return boolean 成功返回true， 失败返回false
	 */
	public boolean deleteSystemModel(int id);
	
}
