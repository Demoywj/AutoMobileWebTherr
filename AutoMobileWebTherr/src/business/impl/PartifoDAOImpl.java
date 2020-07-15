package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.PartifoDAO;
import model.TCarConfig;
import model.TPartifo;
import model.TPartifo;
import model.VVehice;

@Component("partifodao")
public class PartifoDAOImpl implements PartifoDAO {
	private HibBaseDAO  bdao = null;
	
	public PartifoDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<VVehice> getPartifoList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VVehice";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getPartifoAmount(String wherecondition) {
		String hql = "select count(*) from VVehice ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addPartifo(TPartifo partid) {
		Object obj = bdao.insert(partid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delPartifo(int partid) {
		TPartifo brand = (TPartifo)bdao.findById(TPartifo.class, partid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiPartifo(int partid, String partname, String specification, Double partprice, String partphoto) {
		TPartifo tpt = (TPartifo) bdao.findById(TPartifo.class, partid);
		tpt.setPartid(partid);
		tpt.setPartname(partname);
		tpt.setSpecification(specification);
		tpt.setPartprice(partprice);
		tpt.setPartphoto(partphoto);
		
		return bdao.update(tpt);
	}

	@Override
	public TPartifo getPartifo(int partid) {
		TPartifo tpt = (TPartifo) bdao.findById(TPartifo.class, partid);
		return tpt;
	}

	@Override
	public List getAllconfigname(int typeid) {
		String hql = "from VCarConfig where typeid=? order by id asc";
		Object[] para = {typeid};
		List list = bdao.select(hql,para);
		return list;
	}

	@Override
	public List getConfigPartifolist(int configid) {
		String hql = "from TPartifo where configid = ? ";
		Object[] para = {configid};
		List list = bdao.select(hql,para);
		return list;
	}

}
