package cn.edu.nuc.study.dao.interfaces;

import java.util.List;

import cn.edu.nuc.study.entity.Info;
import cn.edu.nuc.study.entity.Page;

public interface InfoMapper {
	
	List<Info> listPageInfo(Page page);
	
}
