package cn.edu.nuc.study.service;

import java.util.List;

import cn.edu.nuc.study.entity.Info;
import cn.edu.nuc.study.entity.Page;

public interface InfoService {
	
	List<Info> listPageInfo(Page page);
	
}
