package org.ahppiaw.controller;

import java.util.Map;

import org.ahppiaw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("handler")
public class StudentController {
	@Autowired
	private StudentService studentService;
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping("queryStuByNo/{stuNo}")
	public String queryStuByNo(@PathVariable("stuNo") int stuNo,Map<String,Object> map) {
		map.put("stu",studentService.queryStudentByno(stuNo));
		return "result";
	}
	
}
