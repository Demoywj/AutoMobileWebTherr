package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.SubscribeDAO;
import model.TSubscribe;
import model.TSubscribeContent;
import model.VServiceNotification;
import model.VSubscribe;


@Component("subscribedao")
public class SubscribeDAOImpl implements SubscribeDAO {
private  HibBaseDAO bdao = null;
	
	public SubscribeDAOImpl(){
		bdao = new HibBaseDAOImpl();
		
	}
	@Override
	public boolean addsubscribe(TSubscribe subscribe) {
		if(bdao.insert(subscribe)==null)
			return false;
		else
			return true;
	}

	@Override
	public boolean modifysubscribe(int subscribeid, String subscribestate) {
		TSubscribe subscribe = (TSubscribe) bdao.findById(TSubscribe.class, subscribeid);
		subscribe.setSubscribestate(subscribestate);		
		return bdao.update(subscribe);
	}

	@Override
	public List<VSubscribe> getsubscribe(String userid,String subscribestate) {
		String hql ="from VSubscribe where userid = ? and subscribestate = ? order by subscribetime desc";
		Object [] para = {userid,subscribestate};
		List<VSubscribe> list = bdao.select(hql, para);
		return list;
	}

	@Override
	public List<VSubscribe> getAllsubscribe() {
		String hql ="from VSubscribe order by subscribetime desc";
		List<VSubscribe> list = bdao.select(hql);
		return list;
	}
	@Override
	public List<VSubscribe> getVSubscribeList(String wherecondition, int currentPage, int pageSize) {
		String hql ="from VSubscribe";		
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		hql += " order by subscribestate desc";
		List<VSubscribe> list = bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public List<TSubscribeContent> getSubscribeContentList(int subscribeid) {
		String hql ="from TSubscribeContent where subscribeid = ?";	
		Object para[]={subscribeid};	
		return bdao.select(hql, para);
	}

}
