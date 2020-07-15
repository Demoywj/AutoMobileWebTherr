package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.UserDAO;
import model.TUser;
/**
 * 车主信息模块接口实现
 * @author 岩温叫
 * @since 2019-5-27
 */
@Component("userdao")
public class UserDAOImpl implements UserDAO {
	private  HibBaseDAO bdao = null;
	
	public UserDAOImpl(){
		bdao = new HibBaseDAOImpl();
		
	}
	@Override
	public boolean adduser(TUser user) {
		if(bdao.insert(user)==null)
			return false;
		else
			return true;
	}

	@Override
	public TUser Userlogin(String userid, String userpwd) {
		String hql = "from TUser where userid = ?   and userpwd = ?";
		Object [] para = {userid,userpwd};
		List list = bdao.select(hql, para);
		if(list.size()>0)
			return (TUser)list.get(0);
		else
			return null;
	}

	@Override
	public boolean modifyuserifo(TUser user) {
	 bdao.findById(TUser.class, user.getUserid());			
		return bdao.update(user);
	}

	@Override
	public boolean modifyuserpwd(String userid, String pwd) {
		TUser user = (TUser) bdao.findById(TUser.class, userid);
		user.setUserpwd(pwd);
		return bdao.update(user);
	}

	@Override
	public List<TUser> queryuser(String wherecondition,
			int currentPage, int pageSize) {
		String hql = "from TUser";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		
		return bdao.selectByPage(hql, currentPage, pageSize);
	}
	@Override
	public int getuserAmount(String wherecondition){
	String hql = "select count(*) from TUser ";
	if (wherecondition != null && !wherecondition.equals("")) {
		hql += wherecondition;
	}
	return bdao.selectValue(hql);
	}
	
	@Override
	public TUser queruser(String userid) {
		TUser user = (TUser) bdao.findById(TUser.class, userid);
		return user;
	}

	@Override
	public boolean deluser(String userid) {	
		return bdao.delete(TUser.class,userid);
	}
	@Override
	public List<TUser> getAllusernameifo(String userid) {
		String hql = "from TUser where userid=?";
		Object[] para = {userid};
		List list = bdao.select(hql, para);
		return list;
	}

}
