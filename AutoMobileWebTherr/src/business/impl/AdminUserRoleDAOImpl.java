package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.AdminUserRoleDAO;

@Component("adminuserroledao")
public class AdminUserRoleDAOImpl implements AdminUserRoleDAO {

	
	private HibBaseDAO bdao = null;
	public AdminUserRoleDAOImpl(){
		this.bdao=new HibBaseDAOImpl();
		
	}
	
	@Override
	public List getAllAdminRoles() {
			String hql = "from TAdminRole order by id asc";
			List list = bdao.select(hql);
			return list;
	}

	@Override
	public int getAllAdminRolesAmount() {
		String hql = "select count(*) from TAdminRole ";
		return bdao.selectValue(hql);
	}
	
	

}
