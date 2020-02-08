package org.ahppiaw.service;

import java.util.List;

import org.ahppiaw.entity.Student;

public interface StudentService {
	List<Student> queryAllStudent();
	Student queryStudentByno(int stuNo);
}
