package cn.edu.nuc.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.nuc.study.dao.interfaces.CouserMapper;
import cn.edu.nuc.study.entity.Couser;
import cn.edu.nuc.study.service.CouserService;

@Service
public class CouserServiceImpl implements CouserService {
	
	/*@Autowired
	private CouserMapper couserMapper;

	@Override
	public void deleteCouser(int cId) {
		// TODO Auto-generated method stub
		couserMapper.deleteCouser(cId);
		
	}

	@Override
	public Couser getCouserById(int cId) {
		// TODO Auto-generated method stub
		return couserMapper.getCouserById(cId);
	}

	@Override
	public boolean insertCouser(Couser couser) {
		// TODO Auto-generated method stub
		int count = couserMapper.getCountByName(couser.getCname());
		if(count>0){
			return false;
		}else{
			couserMapper.insert(couser);
			return true;
		}
	}

	@Override
	public List<Couser> listAllCousers() {
		// TODO Auto-generated method stub
		return couserMapper.listAllCouser();
	}

	@Override
	public List<Couser> listPageCouser(Couser couser) {
		// TODO Auto-generated method stub
		return couserMapper.listPageCouser(couser);
	}

	@Override
	public void updateCouserBaseInfo(Couser couser) {
		// TODO Auto-generated method stub
		couserMapper.updateCouser(couser);
	}

	*/

}
