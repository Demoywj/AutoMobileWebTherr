package business.dao;

import java.util.List;

import model.TScore;
import model.VRepmaiOrder;
import model.VReview;
import model.VScore;
import model.VSubscribe;

/**
 * 服务反馈评分模块接口设计
 * @author 岩温叫
 * @since 2019-5-27
 */
public interface ScoreDAO {
		/**
		 * 添加服务反馈评分信息
		 * @param 服务反馈评分对象score
		 * @return
		 */
		public int addScore(TScore score);
		
		/**
		  * 修改服务反馈评分信息
		 * @param 要修改服务反馈评分对象score
		 * @return
		 */
		public boolean modifyScore(TScore score);
		
		/**
		 * 删除服务反馈评分信息
		 * @param scoreid 评分编号
		 * @return
		 */
		public boolean delScore(int scoreid);
		
		/**
		 * 根据维保单编号获得服务反馈评分信息
		 * @param repmaiid 维保单编号
		 * @return
		 */
		public VScore getscore(int repmaiid);
		
		
		/**
		 * 获得所有服务反馈评分信息
		 * @param repmaiid 维保单编号
		 * @return
		 */
		public List<VScore> getscore();
		
		/**
		 * 查询所有服务反馈评分记录分页加条件
		 * @param wherecondition
		 * @param currentPage
		 * @param pageSize
		 * @return
		 */
		public List<VScore> getVScoreList(
				String wherecondition, int currentPage, int pageSize);
		
		/**
		 * 查询所有服务反馈评分条数
		 * @return 成功返回所有文章条数
		 */
		public int getVScoreAmount(String wherecondition);
		
}
