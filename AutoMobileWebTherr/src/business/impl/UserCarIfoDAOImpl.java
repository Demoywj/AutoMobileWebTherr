package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.UserCarIfoDAO;
import model.TCar;
import model.TInventory;
import model.TRepMaiOrder;
import model.TCar;
import model.TCar;
import model.VCar;
import model.VRepmaiOrder;


@Component("usercarifodao")
public class UserCarIfoDAOImpl implements UserCarIfoDAO {
	private HibBaseDAO  bdao = null;
	
	public UserCarIfoDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<VCar> getUserCarIfoList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VCar";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getUserCarIfoAmount(String wherecondition) {
		String hql = "select count(*) from VCar ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addUserCarIfo(TCar carid) {
		Object obj = bdao.insert(carid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delUserCarIfo(int carid) {
		TCar brand = (TCar)bdao.findById(TCar.class, carid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiUserCarIfo(TCar carid) {
		
		
		return bdao.update(carid);
	}

	@Override
	public TCar getUserCarIfo(int carid) {
		TCar tpt = (TCar) bdao.findById(TCar.class, carid);
		return tpt;
	}

	@Override
	public List<VCar> getAllusernameifo(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VCar> getAllusercarifo(String userid) {
		String hql = "from VCar where userid=?";
		Object[] para = {userid};
		List list = bdao.select(hql, para);
		return list;
	}

	@Override
	public List<TRepMaiOrder> getusercarRepmaiOrder(String userid) {
		String hql = "from TRepMaiOrder where userid=?";
		Object[] para = {userid};
		List list = bdao.select(hql, para);
		return list;
	}

	@Override
	public List<TInventory> getusercarinventory(int repmaiid) {
		String hql = "from TInventory where repmaiid = ?";
		Object[] para = {repmaiid};
		List list = bdao.select(hql, para);
		return list;
	
	}
	
}
