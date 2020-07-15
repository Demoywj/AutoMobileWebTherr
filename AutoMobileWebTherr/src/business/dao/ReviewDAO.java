package business.dao;

import java.util.List;

import model.TArticle;
import model.TReview;
import model.VReview;

/**
 * 评论管理模块接口设计
 * @author 岩温叫
 * @version 2019-5-27
 */
public interface ReviewDAO {
	/**
	 * 添加文章的一条评论信息
	 * @param TReview对象
	 * @return 添加成功的文章编号，如<=0则表示添加失败
	 */
	public Object addReview(TReview review);
	
	/**
	 * 删除文章的一条评论内容信息
	 * @param评论内容编号
	 * @return 受影响的行数
	 */
	public boolean deleteReivew(int articleid);
	
	/**
	 * 删除一个文章的所有评论信息
	 * @param 文章编号
	 * @return 受影响的行数
	 */
	public boolean deleteReviewsBelongForum(int articleid);
	
	/**
	 * 查询属于一个文章的所有评论信息
	 * @param 文章编号
	 * @return 评论对象列表  List<TReview>，按reviewid降序排序
	 */
	public List<VReview> getReviewListByForumId(int articleid);
	
	
	/**
	 * 查询属于一个文章的所有评论信息
	 * @param 文章编号
	 * @return 评论对象列表  List<TReview>，按reviewid降序排序
	 */
	public List<TReview> getTReviewListByForumId(int articleid);
	
	
	/**
	 * 根据评论id获得对应的评论视图对象
	 * @param reviewid
	 * @return
	 */
	public VReview getReviewById(int reviewid);
	
	/**
	 * 查询所有评论记录分页加条件
	 * @param wherecondition
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	public List<VReview> getVReviewList(
			String wherecondition, int currentPage, int pageSize);
	
	/**
	 * 查询所有评论条数
	 * @return 成功返回所有文章条数
	 */
	public int getVReviewAmount(String wherecondition);
	
}
