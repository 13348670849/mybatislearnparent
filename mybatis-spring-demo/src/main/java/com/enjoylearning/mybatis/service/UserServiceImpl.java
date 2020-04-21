package com.enjoylearning.mybatis.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enjoylearning.mybatis.entity.TUser;
import com.enjoylearning.mybatis.mapper.TUserMapper;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private TUserMapper tUserMapper;

	@Override
	public TUser getUserById(Integer id) {
		return tUserMapper.selectByPrimaryKey(id);
	}

}
