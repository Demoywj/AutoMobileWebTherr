package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ReviewDAO;
import model.TReview;
import model.VReview;
import util.ToolsUtil;

@Component("reviewdao")
public class ReviewDAOImpl implements ReviewDAO {
	private HibBaseDAO bdao =null;
	
	public ReviewDAOImpl(){
		bdao = new HibBaseDAOImpl();
	}
	
	public void setBdao(HibBaseDAO bdao) {
		this.bdao = bdao;
	}
	@Override
	public Object addReview(TReview review) {
		return  bdao.insert(review);
	}

	@Override
	public boolean deleteReivew(int articleid) {
		// TODO Auto-generated method stub
		 	return bdao.delete(TReview.class, articleid);
	}

	@Override
	public boolean deleteReviewsBelongForum(int articleid) {
		String sql = "delete from T_Review where articleid = ?";
		Object[] para = {articleid};
		return bdao.delete(sql, para);
	}

	@Override
	public List<VReview> getReviewListByForumId(int articleid) {
		String hql ="from VReview where articleid = ? order by createtime desc";
		Object[] para = {articleid};
		return bdao.select(hql, para);
	}
	
	
	@Override
	public List<TReview> getTReviewListByForumId(int articleid) {
		String hql ="from TReview where articleid = ? order by createtime desc";
		Object[] para = {articleid};
		List<TReview> list = bdao.select(hql, para);
		for (TReview tReview : list) {
			tReview.setCreatetime(ToolsUtil.datetimeFormaaa(tReview.getCreatetime()));
			
		}
		return list;
	}
	

	@Override
	public VReview getReviewById(int reviewid) {
		return (VReview) bdao.findById(VReview.class, reviewid);
	}
	@Override
	public List<VReview> getVReviewList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VReview ";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		hql += " order by createtime desc";
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public int getVReviewAmount(String wherecondition) {
		String hql = "select count(*) from VReview";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	

}
