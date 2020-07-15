package business.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import business.basic.HibBaseDAO;
import business.basic.HibBaseDAOImpl;
import business.dao.ScoreDAO;
import model.TScore;
import model.VScore;


@Component("scoredao")
public class ScoreDAOImpl implements ScoreDAO {
	private HibBaseDAO bdao = null;
	public ScoreDAOImpl(){
		this.bdao=new HibBaseDAOImpl();
		
	}
	@Override
	public int addScore(TScore score) {	
		return  (Integer) bdao.insert(score);
	}

	@Override
	public boolean modifyScore(TScore score) {
		return bdao.update(score);
	}

	@Override
	public boolean delScore(int scoreid) {
		TScore sc = (TScore) bdao.findById(TScore.class, scoreid);
		return bdao.delete(sc);
	}

	@Override
	public VScore getscore(int repmaiid) {
		String hql = "from VScore where repmaiid = ?";
		Object [] para = {repmaiid};
		List<VScore> score = bdao.select(hql, para);
		if(score.size()>0){
			return score.get(0);
			
		}else{
			return null ;
		}
		
	}

	@Override
	public List<VScore> getscore() {
		String hql = "from VScore order by scoretime desc";
		List<VScore> score = bdao.select(hql);
		return score;
	}
	@Override
	public List<VScore> getVScoreList(String wherecondition, int currentPage, int pageSize) {
		String hql = "from VScore ";
		if(wherecondition!=null && !wherecondition.equals("")){
			 hql += wherecondition;
		}
		hql += " order by scoretime desc";
		List list =bdao.selectByPage(hql, currentPage, pageSize);
		return list;
	}
	@Override
	public int getVScoreAmount(String wherecondition) {
		String hql = "select count(*) from VScore";
		if (wherecondition != null && !wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}
	
}
