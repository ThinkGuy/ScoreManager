package com.scoreManager.model;

/**
 * Score.
 * 
 * @author 刘鑫伟
 *
 */
public class Score {
	/**
	 * course id.
	 */
	private int cid;
	/**
	 * course name.
	 */
	private String cname;
	/**
	 * course score.
	 */
	private int score;
	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}
	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * @param cname the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	/**
	 * Default constructor.
	 */
	public Score() {
		super();
	}
	
	/**
	 * Constructor using fields.
	 * @param cid
	 * @param cname
	 * @param score
	 */
	public Score(int cid, String cname, int score) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.score = score;
	}
}
