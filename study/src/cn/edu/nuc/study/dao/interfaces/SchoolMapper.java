package cn.edu.nuc.study.dao.interfaces;

import java.util.List;

import cn.edu.nuc.study.entity.School;

public interface SchoolMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

	/*void deleteSchool(int sId);

	School getSchoolById(int sId);

	int getCountByName(Integer cnum);

	List<School> listAllSchool();

	List<School> listPageSchool(School school);

	void updateSchool(School school);*/
}