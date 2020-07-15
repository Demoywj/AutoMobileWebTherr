package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ActivityNoticeDAO;
import model.TActivityNotice;
import util.ToolsUtil;

/**
 * 活动通知管理模块接口设计实现
 * @author 岩温叫
 * @version 2019-5-27
 */
@Component("activitynoticedao")
public class ActivityNoticeDAOImpl implements ActivityNoticeDAO {
	private  HibBaseDAO bdao = null;
	
	public ActivityNoticeDAOImpl(){
		bdao = new HibBaseDAOImpl();
		
	}
	@Override
	public boolean addAcivityNotice(TActivityNotice article) {
		if(bdao.insert(article)==null)
			return false;
		else
			return true;
	}

	@Override
	public boolean modifyAcivityNotice(int userid,String realname,String userphone,	String articlephoto) {
		TActivityNotice tacti = (TActivityNotice) bdao.findById(TActivityNotice.class, userid);	
		tacti.setActivitytitle(realname);
		tacti.setActivitycontent(userphone);
		tacti.setActivityphoto(articlephoto);	
		return bdao.update(tacti);
	}

	@Override
	public boolean delAcivityNotice(int articleid) {
		return bdao.delete(TActivityNotice.class, articleid);
	}

	@Override
	public TActivityNotice getAcivityNotice(int articleid) {
		TActivityNotice taci = (TActivityNotice) bdao.findById(TActivityNotice.class, articleid);
		taci.setActivitytime(ToolsUtil.datetimeFormaa(taci.getActivitytime()));
		return taci;
	}

	@Override
	public List<TActivityNotice> getAllAcivityNotice() {
		String hql = "from TAcivityNotice order by activitytime desc";
		List<TActivityNotice> list = bdao.select(hql);
		for (TActivityNotice tAcivityNotice : list) {
			tAcivityNotice.setActivitytime(ToolsUtil.datetimeFormaa(tAcivityNotice.getActivitytime()));
			
		}
		return list;
	}
	@Override
	public List<TActivityNotice> getAcivityNoticeList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from TActivityNotice ";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		     hql += " order by activitytime desc";
		
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public int getAcivityNoticeAmount(String wherecondition) {
		String hql = "select count(*) from TActivityNotice";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

}
