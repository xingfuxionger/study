package cn.edu.nuc.study.service.impl;

import java.util.List;

import cn.edu.nuc.study.dao.interfaces.InfoMapper;
import cn.edu.nuc.study.entity.Info;
import cn.edu.nuc.study.entity.Page;
import cn.edu.nuc.study.service.InfoService;


public class InfoServiceImpl implements InfoService{

	private InfoMapper infoMapper;
	
	public List<Info> listPageInfo(Page page) {
		// TODO Auto-generated method stub
		return infoMapper.listPageInfo(page);
	}

	public InfoMapper getInfoMapper() {
		return infoMapper;
	}

	public void setInfoMapper(InfoMapper infoMapper) {
		this.infoMapper = infoMapper;
	}
}
