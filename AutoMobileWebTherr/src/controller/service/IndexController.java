package controller.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import business.dao.AnnouncementDAO;
import business.dao.ArticleDAO;
import business.dao.CarBrandDAO;
import business.dao.ReviewDAO;
import business.dao.ScoreDAO;
import business.factory.DAOFactory;
import model.TAnnouncement;
import model.TArticle;
import model.TCarBrand;
import model.VReview;
import model.VScore;
import util.LayuiTableData;
import util.ResponseJSON;

/**
 * 主页显示控制类
 * 
 * @author ywj
 * @version 2019-6-28
 */
@Controller
@RequestMapping(value = "/indexcontroller")
public class IndexController {

	private ArticleDAO adao = null;
	private ScoreDAO  sdao = null;
	private AnnouncementDAO  andao = null;
	private CarBrandDAO  cdao = null;
	
	@ModelAttribute
	public void init() {
		adao = DAOFactory.getArticleDAO();
		sdao = DAOFactory.getScoreDAO();
		andao = DAOFactory.getAnnouncementDAO();
		cdao = DAOFactory.getCarBrandDAO();
	}

	/**
	 * 文章article
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getarticlelist")
	public void getarticlelist(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List<TArticle> tarticlelist = adao.getArticleList("", 1, 4);

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (tarticlelist != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" +tarticlelist.size();
			rj.resultObject = tarticlelist;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	/**
	 * 服务反馈信息
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getscorelist")
	public void getscorelist(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List<VScore> scorelist =sdao.getVScoreList("", 1, 3);

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (scorelist != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = scorelist;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	/**
	 * 公告信息
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	
	@RequestMapping(value = "/getannouncementlist")
	public void getannouncementlist(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List<TAnnouncement> announcementlist =andao.getAnnouncementList("", 1, 1);

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (announcementlist != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = announcementlist;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	/**
	 * 车辆品牌
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	
	@RequestMapping(value = "/getcarbrandlist")
	public void getCarBrandlist(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List<TCarBrand> carbrandlist =cdao.getCarBrandlist();

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (carbrandlist != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = carbrandlist;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	

}
