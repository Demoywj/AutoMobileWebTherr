package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;


import model.TAdminUser;
import model.VAdminUser;
import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.AdminUserDAO;
import common.properties.LogOperType;

@Component("adminuserdao")
public class AdminUserDAOImpl implements AdminUserDAO {
	
	private HibBaseDAO  bdao = null;
	
	public AdminUserDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	
	@Override
	public List<VAdminUser> getAdminUserList(String wherecondition,
			int currentPage, int pageSize) {
		String hql = "from VAdminUser";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		
		return bdao.selectByPage(hql, currentPage, pageSize);
	}
	
	@Override
	public int getAdaminUserAmount(String wherecondition) {
		String hql = "select count(*) from VAdminUser ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}
	
	@Override
	public int addAdminUser(TAdminUser user) {
		Object obj = bdao.insert(user);
		if(obj!=null){
			return 1;
		}
		return 0;
	}
	
	@Override
	public boolean delAdminUser(String userid) {
		TAdminUser user = (TAdminUser)bdao.findById(TAdminUser.class, userid);
		return bdao.delete(user);
	}
	
	@Override
	public VAdminUser loginUser(String userid, String pwd) {
		String hql = "from VAdminUser where adiminid = ?  and pwd = ?";
		Object [] para = {userid,pwd};
		List list = bdao.select(hql, para);
		if(list.size()>0)
			return (VAdminUser)list.get(0);
		else
			return null;
	}

	@Override
	public boolean modifuser(String userid, String realname, String mobile) {
		TAdminUser admin = (TAdminUser) bdao.findById(TAdminUser.class, userid);
		admin.setRealname(realname);
		admin.setMobile(mobile);
		return bdao.update(admin);
	}



	
}
