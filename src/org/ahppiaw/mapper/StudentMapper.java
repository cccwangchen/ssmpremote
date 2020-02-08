package org.ahppiaw.mapper;

import java.util.List;

import org.ahppiaw.entity.Student;

public interface StudentMapper {
	List<Student> queryAllStudent();
	Student queryStudentByno(int stuNo);
}
