package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ArticleDAO;
import model.TArticle;
import util.ToolsUtil;
/**
 * 文章管理模块接口设计实现
 * @author 岩温叫
 * @version 2019-5-27
 */
@Component("articledao")
public class ArticleDAOImpl implements ArticleDAO {
	private  HibBaseDAO bdao = null;
	
	public ArticleDAOImpl(){
		bdao = new HibBaseDAOImpl();
		
	}
	@Override
	public boolean addArticle(TArticle article) {
		if(bdao.insert(article)==null)
			return false;
		else
			return true;
	}

	@Override
	public boolean modifyArticle(int articleid,String articletitle ,String articlecontent,String articlephoto) {
		TArticle article = (TArticle) bdao.findById(TArticle.class, articleid);
		article.setArticletitle(articletitle);
		article.setArticlecontent(articlecontent);
		article.setArticlephoto(articlephoto);
		return bdao.update(article);
	}

	@Override
	public boolean delArticle(int articleid) {	
		return bdao.delete(TArticle.class, articleid);
	}

	@Override
	public TArticle getArticle(int articleid) {
		TArticle tarticle = (TArticle) bdao.findById(TArticle.class, articleid);
		tarticle.setArticletime(ToolsUtil.datetimeFormaa(tarticle.getArticletime()));
		return tarticle;
	}

	@Override
	public List<TArticle> getAllArticle() {
		String hql = "from TArticle order by articletime desc";
		List<TArticle> list = bdao.select(hql);
		for (TArticle tArticle : list) {			
			tArticle.setArticletime(ToolsUtil.datetimeFormaa(tArticle.getArticletime()));
		}
		return list;
	}
	@Override
	public List<TArticle> getArticleList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from TArticle ";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		     hql += " order by articletime desc";
		
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public int getArticleAmount(String wherecondition) {
		String hql = "select count(*) from TArticle";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}
	@Override
	public boolean increaseReviewCounter(int articleid) {
		String hql = "from TArticle set browsenumber = browsenumber +1 where articleid = ?";
		Object[] para = {articleid};
		return bdao.update(hql, para);
		
	}

}
