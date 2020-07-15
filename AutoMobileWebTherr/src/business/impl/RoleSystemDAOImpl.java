package business.impl;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.RoleSystemDAO;
import model.TRol_SystemModel;

@Component("rolesystemdao")
public class RoleSystemDAOImpl implements RoleSystemDAO {
	private HibBaseDAO bdao = null;
	public RoleSystemDAOImpl(){
		this.bdao=new HibBaseDAOImpl();
		
	}
	


	@Override
	public boolean modifyRoleSystemSuccess(int powerid) {
		TRol_SystemModel trole = (TRol_SystemModel) bdao.findById(TRol_SystemModel.class, powerid);
		trole.setIsedit(true);
		return bdao.update(trole);
	}

	@Override
	public boolean modifyRoleSystemCancelled(int powerid) {
		TRol_SystemModel trole = (TRol_SystemModel) bdao.findById(TRol_SystemModel.class, powerid);
		trole.setIsedit(false);
		return bdao.update(trole);
	}



	@Override
	public int addSystemModelByPower(TRol_SystemModel modelByPower) {
		return 	(Integer) bdao.insert(modelByPower);
	}



	@Override
	public boolean deleteSystemModelBySysid(int sysid) {
		String sql = "delete from T_Role_SystemModel where sysid = ?";
		Object[] para={sysid};
		System.out.println(sql);
		return bdao.delete(sql, para);
	}

}
