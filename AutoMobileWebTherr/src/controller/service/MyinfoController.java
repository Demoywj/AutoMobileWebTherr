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
import business.dao.CarDAO;
import business.dao.ReviewDAO;
import business.dao.ScoreDAO;
import business.dao.UserCarIfoDAO;
import business.dao.UserDAO;
import business.factory.DAOFactory;
import model.ArticleReview;
import model.TArticle;
import model.TCar;
import model.TInventory;
import model.TRepMaiOrder;
import model.TReview;
import model.TUser;
import model.VAdminUser;
import model.VCar;
import model.VRepmaiOrder;
import util.ResponseJSON;

/**
 * 显示个人All信息控制类
 * @author zsx
 * @version 2019-7-4
 */
@Controller
@RequestMapping(value="/userifo")
public class MyinfoController {
	
	
	private UserDAO udao = null;
	private UserCarIfoDAO cdao = null;

	
	@ModelAttribute
	public void init() {
		udao = DAOFactory.getUserDAO();
		cdao = DAOFactory.getUserCarIfoDAO();
		
	}
	
	/**
	 * 车主信息
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getuserifobyuiserid")
	public void getarticlereviewlist( 
			
			HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		
		HttpSession session =request.getSession();
		TUser user =(TUser) session.getAttribute("tuser");
	
		List<TUser> listuser =udao.getAllusernameifo(user.getUserid());
		
		
		
		
		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (listuser != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = listuser;
		}else{
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));	
		//System.out.println(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	/**
	 * 车辆信息
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllusercar")
	public void getAllusercarlist( 
			
			HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		
		HttpSession session =request.getSession();
		TUser user =(TUser) session.getAttribute("tuser");
	
		List<VCar> listuser =cdao.getAllusercarifo(user.getUserid());
		
		
		
		
		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (listuser != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = listuser;
		}else{
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));	
		System.out.println(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	/**
	 * 车辆维保记录
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getuserRepmaiOrder")
	public void getuserRepmaiOrder( 
			
			HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		
		HttpSession session =request.getSession();
		TUser user =(TUser) session.getAttribute("tuser");
	
		List<TRepMaiOrder> listuser =cdao.getusercarRepmaiOrder(user.getUserid());
		
		
		
		
		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (listuser != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = listuser;
		}else{
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));	
		//System.out.println(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	/**
	 * 车辆维保记录
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	@RequestMapping(value = "/getuserinventory")
	public void getuserinventory( 
			int repmaiid,
			HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		
		//HttpSession session =request.getSession();
		//TUser user =(TUser) session.getAttribute("tuser");
	
		List<TInventory> listuser =cdao.getusercarinventory(repmaiid);
		
		
		
		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		
		

		if (listuser != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" +listuser.size();
			rj.resultObject = listuser;
		}else{
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));	
		System.out.println(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
}
