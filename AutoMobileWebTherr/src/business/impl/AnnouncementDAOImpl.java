package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.AnnouncementDAO;
import model.TAnnouncement;
import util.ToolsUtil;
/**
 * 公告管理模块接口设计实现
 * @author 岩温叫
 * @version 2019-5-27
 */
@Component("announcementdao")
public class AnnouncementDAOImpl implements AnnouncementDAO {
	private  HibBaseDAO bdao = null;
	
	public AnnouncementDAOImpl(){
		bdao = new HibBaseDAOImpl();
		
	}
	@Override
	public boolean addAnnouncement(TAnnouncement announ) {
		if(bdao.insert(announ)==null)
			return false;
		else
			return true;
		
	}

	@Override
	public boolean modifyAnnouncement(int antid,String antitle , String ancontent) {
		TAnnouncement anno = (TAnnouncement) bdao.findById(TAnnouncement.class, antid);
		anno.setAntitle(antitle);
		anno.setAncontent(ancontent);
		return bdao.update(anno);
	}

	@Override
	public boolean delAnnouncement(int antid) {
		return bdao.delete(TAnnouncement.class, antid);
	}

	@Override
	public TAnnouncement getAnnouncement(String antid) {
		TAnnouncement announ = (TAnnouncement) bdao.findById(TAnnouncement.class, antid);
		return announ;
	}

	@Override
	public List<TAnnouncement> getAllAnnouncement() {
		String hql = "from TAnnouncement order by antime desc";
		List<TAnnouncement> list = bdao.select(hql);
		for (TAnnouncement tAnnouncement : list) {
			tAnnouncement.setAntime(ToolsUtil.datetimeFormaa(tAnnouncement.getAntime()));
		}
		return list;
	}
	
	@Override
	public List<TAnnouncement> getAnnouncementList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from TAnnouncement";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		     hql += " order by antime desc";
		
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public int getAnnouncementAmount(String wherecondition) {
		String hql = "select count(*) from TAnnouncement ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

}
