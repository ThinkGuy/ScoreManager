package com.scoreManager.model;

/**
 * Score.
 * 
 * @author 刘鑫伟
 *
 */
public class Score {

	/**
	 * math.
	 */
	private int math;

	/**
	 * Chinese.
	 */
	private int chinese;

	/**
	 * English.
	 */
	private int english;

	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}

	/**
	 * @param math
	 *            the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}

	/**
	 * @return the Chinese
	 */
	public int getChinese() {
		return chinese;
	}

	/**
	 * @param chinese
	 *            the Chinese to set
	 */
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	/**
	 * @return the English
	 */
	public int getEnglish() {
		return english;
	}

	/**
	 * @param english
	 *            the English to set
	 */
	public void setEnglish(int english) {
		this.english = english;
	}

	/**
	 * Default constructor.
	 */
	public Score() {
	}

	/**
	 * constructor using fields.
	 * 
	 * @param math
	 *            Math.
	 * @param chinese
	 *            Chinese.
	 * @param english
	 *            English.
	 */
	public Score(int math, int chinese, int english) {
		super();
		this.math = math;
		this.chinese = chinese;
		this.english = english;
	}
}
