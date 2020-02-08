package org.ahppiaw.service.impl;

import java.util.List;

import org.ahppiaw.entity.Student;
import org.ahppiaw.mapper.StudentMapper;
import org.ahppiaw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentMapper studentMapper;
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	@Override
	public List<Student> queryAllStudent() {
		return studentMapper.queryAllStudent();
	}

	@Override
	public Student queryStudentByno(int stuNo) {
		return studentMapper.queryStudentByno(stuNo);
	}
}
