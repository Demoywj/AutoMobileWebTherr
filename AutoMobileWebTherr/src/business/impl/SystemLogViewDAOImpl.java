package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.SystemLogViewDAO;
import model.TSystemLog;

@Component("systemlogdaoviewdao")
public class SystemLogViewDAOImpl implements SystemLogViewDAO {
	private HibBaseDAO bdao = null;
	public SystemLogViewDAOImpl(){
		this.bdao=new HibBaseDAOImpl();
		
	}
	@Override
	public List<TSystemLog> getSystemLogList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from TSystemLog";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}

	@Override
	public int getSystemLogAmount(String wherecondition) {
		String hql = "select count(*)  from TSystemLog";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql +=  wherecondition;
		}
		return  bdao.selectValue(hql);
	}

}
