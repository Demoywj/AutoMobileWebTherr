package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ProContentDAO;
import model.TCarConfig;
import model.TProContent;
import model.TProContent;
import model.VProject;


@Component("procontentdao")
public class ProContentDAOImpl implements ProContentDAO {
private HibBaseDAO  bdao = null;
	
	public ProContentDAOImpl() {
		bdao = new HibBaseDAOImpl();
	}

	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public List<VProject> getProContentList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VProject";
		if(wherecondition != null && !wherecondition.equals("")){
			hql += wherecondition;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public int getProContentAmount(String wherecondition) {
		String hql = "select count(*) from VProject ";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public int addProContent(TProContent procontentid) {
		Object obj = bdao.insert(procontentid);
		if(obj!=null){
			return 1;
		}
		return 0;
	}

	@Override
	public boolean delProContent(int procontentid) {
		TProContent brand = (TProContent)bdao.findById(TProContent.class, procontentid);
		return bdao.delete(brand);
	}

	@Override
	public boolean modiProContent(int procontentid, String procontentname, Double proprice, Double prohour,
			Double pronumprice) {
		TProContent tct = (TProContent) bdao.findById(TProContent.class, procontentid);
		tct.setProcontentid(procontentid);
		tct.setProcontentname(procontentname);
		tct.setProprice(proprice);
		tct.setProhour(prohour);
		tct.setPronumprice(pronumprice);
		
		return bdao.update(tct);
	}

	@Override
	public TProContent getprocontentid(int procontentid) {
		TProContent vct = (TProContent) bdao.findById(TProContent.class, procontentid);
		return vct;
	}

	@Override
	public List getAllprocolumnname(int projectid) {
		String hql = "from TProColumn where projectid=? order by id asc";
		Object[] para = {projectid};
		List list = bdao.select(hql,para);
		return list;
	}

}
