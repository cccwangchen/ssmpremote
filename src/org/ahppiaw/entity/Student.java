package org.ahppiaw.entity;

public class Student {
	private String stuName;
	private int stuNo;
	private int stuAge;
	public Student() {
	}
	public Student(int stuNo,int stuAge,String stuName) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "stuNo:"+stuNo+",stuName:"+stuName+",stuAge:"+stuAge;
	}
}
