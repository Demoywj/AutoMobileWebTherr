package controller.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

import business.dao.ActivityNoticeDAO;
import business.impl.ActivityNoticeDAOImpl;
import util.Expression;
import util.LayuiTableData;

/**
 * 用户预约控制类
 * @author ywj
 * @version 2019-6-28
 */
@Controller
@RequestMapping(value="/appointmentcontroller")
public class AppointmentController {

	
	@RequestMapping(value = "/getprojectcolumncontentlist")
	public void getarticlelist(		
			HttpServletRequest request,
			HttpServletResponse response,
			Model model) throws IOException{
		
		
		

//		List list = audao.getAcivityNoticeList(wherecondition, page, limit);
//		int size = audao.getAcivityNoticeAmount(wherecondition);
//		//回传json字符串
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("application/json");
//		PrintWriter out = response.getWriter();
//		LayuiTableData td = new LayuiTableData();
//		if(list!=null){
//			td.code = LayuiTableData.FLAG_SUCC;
//			td.count = size;
//			td.msg = "查询成功，共查出" + td.count + "条记录";
//			td.data = list;
//		}else{
//			td.code = LayuiTableData.FLAG_FAIL;
//			td.msg = "查询失败";
//		}	
//		out.write(JSON.toJSONString(td));
//		out.flush();
//		out.close();
		
	}
	
	
}
