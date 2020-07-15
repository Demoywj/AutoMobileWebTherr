package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ProColumnDAO;
import model.TCarType;
import model.TProColumn;
import model.VProColumn;

@Component("procolumndao")
public class ProColumnDAOImpl implements ProColumnDAO {
private HibBaseDAO  bdao = null;
	
	public ProColumnDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<VProColumn> getProColumnList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VProColumn";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getProColumnAmount(String wherecondition) {
		String hql = "select count(*) from VProColumn ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addProColumn(TProColumn procolumnid) {
		Object obj = bdao.insert(procolumnid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delProColumn(int procolumnid) {
		TProColumn brand = (TProColumn)bdao.findById(TProColumn.class, procolumnid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiProColumn(int procolumnid, String procolumnname, String procolumnpicture) {
		TProColumn tct = (TProColumn) bdao.findById(TProColumn.class, procolumnid);
		tct.setProcolumnid(procolumnid);
		tct.setProcolumnname(procolumnname);
		tct.setProcolumnpicture(procolumnpicture);
		
		return bdao.update(tct);
	}

	@Override
	public TProColumn getprocolumnid(int procolumnid) {
		TProColumn vct = (TProColumn) bdao.findById(TProColumn.class, procolumnid);
		return vct;
	}

	@Override
	public List getAllProColumn() {
		String hql = "from TProProject order by id asc";
		List list = bdao.select(hql);
		return list;
	}

}
