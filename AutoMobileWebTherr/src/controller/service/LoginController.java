package controller.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import business.dao.AdminUserDAO;
import business.dao.AnnouncementDAO;
import business.dao.UserDAO;
import business.factory.DAOFactory;
import model.TUser;
import model.VAdminUser;
import util.ResponseJSON;

/**
 * 车主登录控制类
 * @author ywj
 * @version 2019-6-28
 */
@Controller
@RequestMapping(value="/userlogincontroller")
public class LoginController {
	
	private UserDAO  udao = null;
	@ModelAttribute
	public void init() {
		
		udao = DAOFactory.getUserDAO();
	}
	
	
	
	@RequestMapping(value = "/userlogin")
	public void userlogin(String userid, String pwd,String verificationCode, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		
		TUser tuser = udao.Userlogin(userid, pwd);
		ResponseJSON rj = new ResponseJSON();
		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();
		
		String srand =(String)session.getAttribute("rand");
	
		if (tuser != null && tuser.getUserid()!=null && srand.equals(verificationCode)  ) {
			rj.code = ResponseJSON.FLAG_SUCC;
			rj.msg = "登录成功";
			rj.resultObject =tuser;
			session.setAttribute("tuser", tuser);

			

		} 
		else if(!srand.equals(verificationCode)){
			
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "验证码输入错误";

			
			
		} else {
			rj.code = ResponseJSON.FLAG_FAIL;
			rj.msg = "登录失败账号或密码输入错误";

			
		}
		// 回传json字符串
					response.setCharacterEncoding("utf-8");
					response.setContentType("application/json");

					out.write(JSON.toJSONString(rj));
					out.flush();
					out.close();
	}
	
}
