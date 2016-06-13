package com.scoreManager.model;

/**
 * Course.
 * 
 * @author Liu,xinwei.
 *
 */
public class Course {
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
	private int Score;
	
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
		return Score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		Score = score;
	}
	/**
	 * Default constructor.
	 */
	public Course() {
		super();
	}
	
	/**
	 * Constructor using fields.
	 * @param cid
	 */
	public Course(int cid) {
		this.cid = cid;
	}
	
	/**
	 * Constructor using fields.
	 * @param cid
	 * @param cname
	 */
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	/**
	 * @param cid
	 * @param cname
	 * @param score
	 */
	public Course(int cid, String cname, int score) {
		super();
		this.cid = cid;
		this.cname = cname;
		Score = score;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", Score=" + Score
				+ "]";
	}
}
