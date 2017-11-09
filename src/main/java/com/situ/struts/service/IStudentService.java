package com.situ.struts.service;

import java.util.List;

import com.situ.struts.pojo.Student;

public interface IStudentService {

	/**
	 * 返回所有数据
	 * @return
	 */
	List<Student> findAll();

}
