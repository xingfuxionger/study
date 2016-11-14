package cn.edu.nuc.study.dao.interfaces;

import java.util.List;

import cn.edu.nuc.study.entity.Couser;

public interface CouserMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Couser record);

    int insertSelective(Couser record);

    Couser selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Couser record);

    int updateByPrimaryKey(Couser record);

	/*Couser getCouserById(int cId);

	void updateCouser(Couser couser);

	void deleteCouser(int cId);

	List<Couser> listAllCouser();

	List<Couser> listPageCouser(Couser couser);

	int getCountByName(String cname);*/
}