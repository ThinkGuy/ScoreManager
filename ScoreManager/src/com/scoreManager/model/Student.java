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

	private ArrayList<Score> scores = new ArrayList<Score>();

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
	 * @return the scores
	 */
	public ArrayList<Score> getScores() {
		return scores;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(ArrayList<Score> scores) {
		this.scores = scores;
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
	 * @param name
	 */
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}
