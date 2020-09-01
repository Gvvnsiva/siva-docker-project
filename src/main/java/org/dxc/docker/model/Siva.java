package org.dxc.docker.model;

public class Siva {
	private String  name;
	private String branch;
	public Siva() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Siva(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Siva [name=" + name + ", branch=" + branch + "]";
	}
	

}
