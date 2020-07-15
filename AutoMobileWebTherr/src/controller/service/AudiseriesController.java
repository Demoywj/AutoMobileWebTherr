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

import business.dao.ArticleDAO;
import business.dao.CarConfigDAO;
import business.dao.CarTypeDAO;
import business.dao.PartifoDAO;
import business.factory.DAOFactory;
import model.TCarBrand;
import model.TCarConfig;
import model.TCarType;
import util.ResponseJSON;

/**
 * 查看车系 车系配置 配置部件信息
 * @author ywj
 * @version 2019-6-28
 */

@Controller
@RequestMapping(value="/audiseriescontroller")
public class AudiseriesController {
		
	
	
	private CarTypeDAO cdao = null;
	private CarConfigDAO ccdao = null;
	private PartifoDAO pdao = null;
	
	@ModelAttribute
	public void init() {
		cdao = DAOFactory.getCarTypeDAO();
		ccdao = DAOFactory.getCarConfigDAO();
		pdao = DAOFactory.getPartifoDAO();
	}
	/**
	 * 车辆类型
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	
	@RequestMapping(value = "/getcarbrandtypelist")
	public void getCarBrandlist(int brandid,HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List<TCarType> cartypelist =cdao.getCarBrandTCarType(brandid);

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (cartypelist != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = cartypelist;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	/**
	 * 车辆配置
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	
	@RequestMapping(value = "/gettypeConfiglist")
	public void gettypeConfiglist(int typeid,HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List<TCarConfig> cartypelist =ccdao.getTypeCarConfig(typeid);

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (cartypelist != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = cartypelist;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	/**
	 * 车辆部件
	 * @param request
	 * @param response
	 * @param model
	 * @throws IOException
	 */
	
	@RequestMapping(value = "/getConfigPartifolist")
	public void getConfigPartifolist(int configid,HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		List list = pdao.getConfigPartifolist(configid);

		// 回传json字符串
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		ResponseJSON rj = new ResponseJSON();
		if (list != null) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "查询成功" ;
			rj.resultObject = list;
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "查询失败";
		}
		out.write(JSON.toJSONString(rj));
		out.flush();
		out.close();

	}
	
	
	
	
	
	
	
	
	
}
