package business.impl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.alibaba.fastjson.JSON;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.TBulletinDAO;
import model.TBulletin;



public class TBulletinDAOimpl implements TBulletinDAO {
	HibBaseDAO bdao=new HibBaseDAOImpl();
	@Override
	public int addTBulletin(TBulletin tbull) {
		return  (Integer) bdao.insert(tbull);
	}

	





}
