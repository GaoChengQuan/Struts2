package com.situ.struts.service.impl;

import java.util.List;

import com.situ.struts.dao.IStudentDao;
import com.situ.struts.dao.impl.StudentDaoMySqlImpl;
import com.situ.struts.pojo.Student;
import com.situ.struts.service.IStudentService;

public class StudentServiceImpl implements IStudentService{
	private IStudentDao studentDao = new StudentDaoMySqlImpl();
			
	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}
}
