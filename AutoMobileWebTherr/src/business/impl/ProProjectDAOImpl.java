package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ProProjectDAO;
import model.TCarBrand;
import model.TProProject;


@Component("proprojectdao")
public class ProProjectDAOImpl implements ProProjectDAO {
private HibBaseDAO  bdao = null;
	
	public ProProjectDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<TProProject> getProProjectList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from TProProject";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getProProjectAmount(String wherecondition) {
		String hql = "select count(*) from TProProject ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addProProject(TProProject tp) {
		Object obj = bdao.insert(tp);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delProProject(int projectid) {
		TProProject brand = (TProProject)bdao.findById(TProProject.class, projectid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiProProject(TProProject projectid) {
		return bdao.update(projectid);
	}

	@Override
	public TProProject getProProject(int projectid) {
		TProProject tcb = (TProProject) bdao.findById(TProProject.class, projectid);
		return tcb;
	}

}
