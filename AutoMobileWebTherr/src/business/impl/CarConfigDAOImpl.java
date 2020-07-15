package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.CarConfigDAO;
import model.TCarConfig;
import model.TCarType;
import model.VCarConfig;

@Component("carconfigdao")
public class CarConfigDAOImpl implements CarConfigDAO {
	private HibBaseDAO  bdao = null;
	
	public CarConfigDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<VCarConfig> getCarConfigList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VCarConfig";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getCarConfigAmount(String wherecondition) {
		String hql = "select count(*) from VCarConfig ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addCarConfig(TCarConfig configid) {
		Object obj = bdao.insert(configid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delCarConfig(int configid) {
		TCarConfig brand = (TCarConfig)bdao.findById(TCarConfig.class, configid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiCarConfig(int configid, String configname) {
		TCarConfig tct = (TCarConfig) bdao.findById(TCarConfig.class, configid);
		tct.setConfigname(configname);
		
		return bdao.update(tct);
	}

	@Override
	public TCarConfig getCarConfigid(int configid) {
		TCarConfig vct = (TCarConfig) bdao.findById(TCarConfig.class, configid);
		return vct;
	}

	@Override
	public List getAlltypename(int brandid) {
		String hql = "from TCarType where brandid=? order by id asc";
		Object[] para = {brandid};
		List list = bdao.select(hql,para);
		return list;
	}

	@Override
	public List<TCarConfig> getTypeCarConfig(int typeid) {
		String hql = "from TCarConfig where typeid = ? ";
		Object[] para = {typeid};
		List list = bdao.select(hql,para);
		return list;
	}

}
