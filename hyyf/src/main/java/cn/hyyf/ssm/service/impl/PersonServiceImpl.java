package cn.hyyf.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hyyf.ssm.domain.Person;
import cn.hyyf.ssm.mapper.PersonMapper;
import cn.hyyf.ssm.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	PersonMapper personMapper;
	
	
	@Override
	public List<Person> listAll() {
		return personMapper.listAll();
	}


	@Override
	public int addRecord(Person p) {
		return personMapper.addRecord(p);
	}


	@Override
	public int saveOrUpdate(Person p) {
		return personMapper.saveOrUpdate(p);
	}


	@Override
	public Person getDetail(String id) {
		return personMapper.getDetail(id);
	}

}
