package com.scoreManager.model;

import java.util.ArrayList;

/**
 * Student.
 * 
 * @author 刘鑫伟
 *
 */
public class Student {

	/**
	 * id.
	 */
	private int id;

	/**
	 * name.
	 */
	private String name;

	/**
	 * age.
	 */
	private int age;

	/**
	 * socre.
	 */
	private ArrayList<Course> courses = new ArrayList<Course>();

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the courses
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses
	 *            the courses to set
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	/**
	 * Default constructor.
	 */
	public Student() {
	}

	/**
	 * Constructor using fields.
	 * 
	 * @param id
	 */
	public Student(int id) {
		super();
		this.id = id;
	}
	
	/**
	 * Constructor using fields.
	 * 
	 * @param id
	 * @param name
	 */
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", courses=" + courses + "]";
	}

	
}
