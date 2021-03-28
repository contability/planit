package kr.co.planit.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.planit.dao.PlnUserDao;
import kr.co.planit.dto.PlnUser;

@Service
public class PlnUserServiceImpl implements PlnUserService{
	
	@Resource
	PlnUserDao plnUserDao;

	@Override
	public PlnUser list() {
		return plnUserDao.list();
	}
	
	
}
