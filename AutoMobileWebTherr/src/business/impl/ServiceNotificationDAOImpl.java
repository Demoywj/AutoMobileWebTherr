package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ServiceNotificationDAO;
import model.TRepMaiOrder;
import model.TServiceNotification;
import model.VPoRepmaiOrder;
import model.VRepmaiOrder;
import model.VServiceNotification;


@Component("servicenotificationdao")
public class ServiceNotificationDAOImpl implements ServiceNotificationDAO {
private  HibBaseDAO bdao = null;
	
	public ServiceNotificationDAOImpl(){
		bdao = new HibBaseDAOImpl();
		
	}
	@Override
	public boolean addServiceNotification(TServiceNotification Notifica) {
		if(bdao.insert(Notifica)==null)
			return false;
		else	
			return true;
	}	

	@Override
	public boolean modifyServiceNotification(TServiceNotification Notifica) {
		bdao.findById(TServiceNotification.class, Notifica.getServiceid());
		return bdao.update(Notifica);
	}

	@Override
	public boolean delServiceNotification(int serviceid) {	
		return bdao.delete(TServiceNotification.class, serviceid);
	}

	@Override
	public VServiceNotification getServiceNotification(String userid) {
		String hql ="from VServiceNotification where  and userid = ?";
		Object [] para = {userid};
		List<VServiceNotification> list = bdao.select(hql, para);
		if(list.size()>0)
			return (VServiceNotification)list.get(0);
		else
			return null;
	}

	@Override
	public List<VServiceNotification> getAllServiceNotification(String wherecondition, int currentPage, int pageSize) {
		String hql ="from VServiceNotification";		
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		hql += " order by servicetime desc";
		List<VServiceNotification> list = bdao.selectByPage(hql, currentPage, pageSize);
		return list;
		
	}
	@Override
	public List<VPoRepmaiOrder> getVPoRepmaiOrderList(int wherecondition, int currentPage, int pageSize) {
		String hql = "";
		if(wherecondition == 1 ){
			hql = "from VPoRepmaiOrder where DateAdd(Month,-3,getdate())>repmainordertime";
		}else{
			hql = "from VPoRepmaiOrder where DateAdd(Month,-6,getdate())>repmainordertime";
		}
			hql += " order by repmainordertime desc";
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public int getVPoRepmaiOrderAmount(String wherecondition) {
		String hql = "select count(*) from VPoRepmaiOrder";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}
	@Override
	public VPoRepmaiOrder getVPoRepmaiOrder(int repmaiid) {
		VPoRepmaiOrder vpo = (VPoRepmaiOrder) bdao.findById(VPoRepmaiOrder.class, repmaiid);
		return vpo;
	}
	@Override
	public boolean addTRepMaiOrderremark(int repmaiid,String remark) {
		TRepMaiOrder tr = (TRepMaiOrder) bdao.findById(TRepMaiOrder.class, repmaiid);
		tr.setRemark(remark);
		return bdao.update(tr);
	}
	@Override
	public TServiceNotification getTServiceNotification(int serviceid) {
		return (TServiceNotification) bdao.findById(TServiceNotification.class, serviceid);
	}
}
