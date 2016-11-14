package cn.edu.nuc.study.service.impl;

import java.util.List;

import cn.edu.nuc.study.dao.interfaces.SchoolMapper;
import cn.edu.nuc.study.entity.School;
import cn.edu.nuc.study.service.SchoolService;


public class SchoolServiceImpl implements SchoolService {
	
	/*private SchoolMapper schoolMapper;
	
	@Override
	public void deleteSchool(int sId) {
		// TODO Auto-generated method stub
		schoolMapper.deleteSchool(sId);
	}

	@Override
	public School getSchoolById(int sId) {
		// TODO Auto-generated method stub
		return schoolMapper.getSchoolById(sId);
	}

	@Override
	public boolean insertSchool(School school) {
		// TODO Auto-generated method stub
		int count = schoolMapper.getCountByName(school.getCnum());
		if(count>0){
			return false;
		}else{
			schoolMapper.insert(school);
			return true;
		}
	}

	@Override
	public List<School> listAllSchools() {
		// TODO Auto-generated method stub
		return schoolMapper.listAllSchool();
	}

	@Override
	public List<School> listPageSchool(School school) {
		// TODO Auto-generated method stub
		return schoolMapper.listPageSchool(school);
	}

	@Override
	public void updateSchoolBaseInfo(School school) {
		// TODO Auto-generated method stub
		schoolMapper.updateSchool(school);
	}*/

}
