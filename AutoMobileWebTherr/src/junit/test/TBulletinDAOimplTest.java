package junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import business.dao.TBulletinDAO;
import business.impl.TBulletinDAOimpl;
import model.TBulletin;

public class TBulletinDAOimplTest {
	TBulletinDAO tb =null;
	@Before
	public void init(){
		tb = new TBulletinDAOimpl();
	}
	@Test
	public void testAddTBulletin() {
		TBulletin tbu = new TBulletin();
		tbu.setEditorialContent("图书馆2楼捡到一个钱包，有丢失者前来认领");
		tbu.setTitle("失物招领");
		tbu.setContentGet("16612210010");
		tbu.setTime("2020-02-01");
		System.out.println(tb.addTBulletin(tbu));
	}



}
