package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.SystemModelDAO;
import model.TSystemModel;
import model.VRoleSystemModel;

@Component("systemmodeldao")
public class SystemModelDAOImpl implements SystemModelDAO {
	private HibBaseDAO bdao = null;
	public SystemModelDAOImpl(){
		this.bdao=new HibBaseDAOImpl();
		
	}
	@Override
	public List<TSystemModel> getTSystemModelList(String wherecondition, int currentPage, int pageSize) {
		String hql ="from TSystemModel ";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		hql +=" order by parentid,displayorder asc";
		return bdao.selectByPage(hql, currentPage, pageSize);
	}
	@Override
	public int getTSystemModelAmount(String wherecondition) {
		String hql = "select count(*) from TSystemModel";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}
	
	
	@Override
	public List<VRoleSystemModel> getSystemModelByRole(int roleid) {
		String hql ="from VRoleSystemModel where roleid = ? order by parentid,displayorder asc";
		Object para [] = {roleid};
		return bdao.select(hql, para);
		
	}
	@Override
	public int addSystemModel(TSystemModel TSystem) {	
		return  (Integer) bdao.insert(TSystem);
	}
	@Override
	public List<TSystemModel> getTSystemModelByDeepthParentid(int deepth, int parentid) {
		String hql = "from TSystemModel where deepth = ? and parentid = ? and isdelete = 'false'";
		Object[] para = {deepth,parentid};
		hql +="  order by deepth,parentid,displayorder asc";
		return bdao.select(hql, para);
	}
	@Override
	public TSystemModel getTSystemModelById(int systemModelid) {
		return (TSystemModel)bdao.findById(TSystemModel.class, systemModelid);
	}
	@Override
	public boolean updateSystemModel(TSystemModel systemModel) {
		return bdao.update(systemModel);
	}
	@Override
	public boolean deleteSystemModel(int systemModelid) {
//		TSystemModel systemModel = (TSystemModel)bdao.findById(TSystemModel.class, systemModelid);
//		if(systemModel!=null && !systemModel.getIsdelete()){//
//			systemModel.setIsdelete(true);
//			return bdao.update(systemModel);
//		}
//		return false;
		TSystemModel systemModel = (TSystemModel)bdao.findById(TSystemModel.class, systemModelid);
		return bdao.delete(systemModel);
		
		
		
	}
	

}
