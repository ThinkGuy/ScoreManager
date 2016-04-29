package com.scoreManager.database;

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
	private String id;

	/**
	 * name.
	 */
	private String name;

	/**
	 * score.
	 */
	private Score score;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
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
	 * @return the score
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(Score score) {
		this.score = score;
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
	 * @param score
	 */
	public Student(String id, String name, Score score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
}
