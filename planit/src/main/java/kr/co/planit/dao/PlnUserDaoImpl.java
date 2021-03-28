package kr.co.planit.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import kr.co.planit.dto.PlnUser;
import kr.co.planit.mapper.PlnUserMapper;

@Repository
public class PlnUserDaoImpl implements PlnUserDao{
	
	@Resource
	PlnUserMapper plnUserMapper;

	@Override
	public PlnUser list() {
		return plnUserMapper.list();
	}
	
	
	
}
