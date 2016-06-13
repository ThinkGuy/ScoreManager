package com.scoreManager.model;

/**
 * 
 * @author Liu,xinwei.
 *
 */
public class Manager {
	/**
	 * Manager name.
	 */
	private String name;

	/**
	 * Manager password.
	 */
	private String password;

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
	 * @return the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * default constructor.
	 */
	public Manager() {

	}

	/**
	 * constructor using fields.
	 * 
	 * @param name
	 *            name.
	 * @param password
	 *            password.
	 */
	public Manager(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
}
