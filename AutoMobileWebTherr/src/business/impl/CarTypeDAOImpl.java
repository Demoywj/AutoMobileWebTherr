package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.CarTypeDAO;
import model.TAdminUser;
import model.TCarBrand;
import model.TCarType;
import model.VCarType;


@Component("cartypedao")
public class CarTypeDAOImpl implements CarTypeDAO {
	private HibBaseDAO  bdao = null;
	
	public CarTypeDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<VCarType> getCarTypeList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VCarType";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getCarTypeAmount(String wherecondition) {
		String hql = "select count(*) from VCarType ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addCarType(TCarType typeid) {
		Object obj = bdao.insert(typeid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delCarType(int typeid) {
		TCarType brand = (TCarType)bdao.findById(TCarType.class, typeid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiCarType(int typeid,String typename) {
		TCarType tct = (TCarType) bdao.findById(TCarType.class, typeid);
		tct.setTypename(typename);
		
		return bdao.update(tct);
	}
	

	@Override
	public TCarType getCarTypeid(int typeid) {
		TCarType vct = (TCarType) bdao.findById(TCarType.class, typeid);
		return vct;
	}


	@Override
	public List getAllCarType() {
		String hql = "from TCarBrand order by id asc";
		List list = bdao.select(hql);
		return list;
	}

	@Override
	public List<TCarType> getCarBrandTCarType(int brandid) {
		String hql ="from TCarType where brandid = ?";
		Object [] para = {brandid};
		return bdao.select(hql, para);
	}

}
