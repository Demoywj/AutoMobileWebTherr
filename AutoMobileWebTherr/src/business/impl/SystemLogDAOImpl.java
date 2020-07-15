package business.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import common.properties.OperType;
import model.TSystemLog;
import model.VAdminUser;
import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.AdminUserDAO;
import business.dao.SystemLogDAO;

@Component("systemlogdao")
public class SystemLogDAOImpl implements SystemLogDAO {
	private HibBaseDAO bdao= null;

	public SystemLogDAOImpl() {
		this.bdao = new HibBaseDAOImpl();
	}

	@Override
	public List<TSystemLog> getSystemLogList(String wherecondition,
			int currentPage, int pageSize) {
		String hql = "from TSystemLog ";
		if(wherecondition!=null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		List list = bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}

	@Override
	public int getSystemLogAmount(String wherecondition) {
		String hql = "select count(*) from TSystemLog ";
		if(wherecondition!=null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public List<String> getOperTypes() {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<OperType.OPERTYPES.length;i++){
			list.add(OperType.OPERTYPES[i]);
		}
		return list;
	}
	
	@Override
	public boolean deleteLogById(String id) {
		return bdao.delete(TSystemLog.class, id);
	}

	@Override
	public Integer addLog(TSystemLog record) {
		// TODO Auto-generated method stub
		return (Integer)bdao.insert(record);
	}

	@Override
	public TSystemLog getLogById(String id) {
		// TODO Auto-generated method stub
		return (TSystemLog)bdao.findById(TSystemLog.class, id);
	}


}