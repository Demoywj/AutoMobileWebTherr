package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.CarBrandDAO;
import model.TAdminUser;
import model.TCarBrand;
import model.TUser;
@Component("carBranddao")
public class CarBrandDAOImpl implements CarBrandDAO {
	private HibBaseDAO  bdao = null;
	
	public CarBrandDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<TCarBrand> getCarBrandList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from TCarBrand";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getCarBrandAmount(String wherecondition) {
		String hql = "select count(*) from TCarBrand ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addCarBrand(TCarBrand brandid) {
		Object obj = bdao.insert(brandid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delCarBrand(int brandid) {
		TCarBrand brand = (TCarBrand)bdao.findById(TCarBrand.class, brandid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiCarBrand(TCarBrand brandid) {
		return bdao.update(brandid);
	}

	@Override
	public TCarBrand getCarBrandid(int brandid) {
		TCarBrand tcb = (TCarBrand) bdao.findById(TCarBrand.class, brandid);
		return tcb;
	}

	@Override
	public List<TCarBrand> getCarBrandlist() {
		String hql = "from TCarBrand";
		return bdao.select(hql);
	}

}
