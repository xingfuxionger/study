package cn.edu.nuc.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.nuc.study.dao.interfaces.TeacherMapper;
import cn.edu.nuc.study.entity.Teacher;
import cn.edu.nuc.study.service.TeacherService;


public class TeacherServiceImpl implements TeacherService {
	
	/*@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public void deleteTeacher(int tId) {
		// TODO Auto-generated method stub
		teacherMapper.deleteTeacher(tId);
	}
	
	@Override
	public Teacher getTeacherById(int tId) {
		// TODO Auto-generated method stub
		return teacherMapper.getTeacherById(tId);
	}
	
	@Override
	public boolean insertTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		int count = teacherMapper.getCountByName(teacher.getTname());
		if(count>0){
			return false;
		}else{
			teacherMapper.insert(teacher);
			return true;
		}
	}

	@Override
	public List<Teacher> listAllTeachers() {
		// TODO Auto-generated method stub
		return teacherMapper.listAllTeacher();
	}

	@Override
	public List<Teacher> listPageCouser(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherMapper.listPageTeacher(teacher);
	}

	@Override
	public void updateTeacherBaseInfo(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherMapper.updateTeacher(teacher);
	}



	*/

}
