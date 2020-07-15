package controller.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import model.TUser;
import util.ResponseJSON;

/**
 * 车主退出登录控制类
 * @author ywj
 * @version 2019-6-28
 */
@Controller
@RequestMapping(value="/useroutlogincontroller")
public class OutLoginController {

	@RequestMapping(value = "/outuserlogin")
	public void outuserlogin(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		HttpSession session = request.getSession();
		session.removeAttribute("tuser");
	
	}
}
