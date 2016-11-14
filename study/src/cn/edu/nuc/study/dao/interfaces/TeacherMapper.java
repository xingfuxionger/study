package cn.edu.nuc.study.dao.interfaces;

import java.util.List;

import cn.edu.nuc.study.entity.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

	/*void deleteTeacher(int tId);

	Teacher getTeacherById(int tId);

	int getCountByName(String tname);
	
	List<Teacher> listAllTeacher();

	List<Teacher> listPageTeacher(Teacher teacher);

	void updateTeacher(Teacher teacher);*/
}