package com.scp.NewHibernate.Product;


/**
 * 
 * @author Saurabhee
 *
 */


public class Product1 {
	private int id;
	private String name;
	public Product1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + "]";
	}
	
	

}
