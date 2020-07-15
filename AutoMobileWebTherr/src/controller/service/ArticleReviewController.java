package controller.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import business.dao.AnnouncementDAO;
import business.dao.ArticleDAO;
import business.dao.ReviewDAO;
import business.dao.ScoreDAO;
import business.factory.DAOFactory;
import model.ArticleReview;
import model.TArticle;
import model.TReview;
import model.TUser;
import util.ResponseJSON;

/**
 * 显示文章及评论控制类
 * @author ywj
 * @version 2019-6-28
 */
@Controller
@RequestMapping(value="/articlereviewcontroller")
public class ArticleReviewController {
	
	
	private ArticleDAO adao = null;
	private ReviewDAO  rdao = null;

	
	@ModelAttribute
	public void init() {
		adao = DAOFactory.getArticleDAO();
		rdao = DAOFactory.getReviewDAO();
		
	}
	
	/**
	 * 详细文章及评论articlereview
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getarticlereviewlist")
	public void getarticlereviewlist( int articleid,HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		ArticleReview articlereview = new ArticleReview();
		
		TArticle article= adao.getArticle(articleid);
		
		List<TReview> reviewlist =rdao.getTReviewListByForumId(articleid);
		
		articlereview.setArticle(article);
		articlereview.setListreview(reviewlist);
		
		
		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (articlereview != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = articlereview;
		}else{
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();
	}
	
	
	/**
	 * 添加评论review
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/addreview")
	public void addreview(int articleid,String review, HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {
		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		HttpSession session = request.getSession();
		TUser tuser =(TUser) session.getAttribute("tuser");
		
		TReview treview = new TReview();
		treview.setArticleid(articleid);
		treview.setReviewcontent(review);
		treview.setUserid(tuser.getUserid());
		
		if (rdao.addReview(treview)!=null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "添加评论成功";
		
			
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "添加评论失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	
	
	
	
}
