package business.dao;

import java.util.List;

import model.TAnnouncement;
import model.TArticle;

/**
 * 文章管理模块接口设计
 * @author 岩温叫
 * @version 2019-5-27
 */
public interface ArticleDAO {
	/**
	 * 添加文章
	 * @param 文章article对象
	 * @return
	 */
	public boolean addArticle(TArticle article);
	
	/**
	 * 修改文章
	 * @param 文章article对象
	 * @return
	 */
	public boolean modifyArticle(int articleid,String articletitle ,String articlecontent,String articlephoto);
	
	/**
	 * 删除文章
	 *  @param 文章id编号
	 * @return
	 */
	public boolean delArticle(int articleid);
	/**
	 * 查询单条文章记录
	 * @param 文章id编号
	 */
	public TArticle getArticle(int articleid);
	
	/**
	 * 查询所有文章记录
	 * 
	 */
	public List<TArticle> getAllArticle();
	
	/**
	 * 查询所有文章记录分页加条件
	 * @param wherecondition
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<TArticle> getArticleList(
			String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 查询所有文章条数
	 * @return 成功返回所有文章条数
	 */
	public int getArticleAmount(String wherecondition);

	/**
	 * 文章评论数加1
	 * @param forumid
	 * @return
	 */
	
	public boolean increaseReviewCounter(int forumid);
	
}
