package com.moudle;

public class Customer1 implements Comparable{
	String name;
	Integer id;
	public Customer1() {
		super();
	}
	public Customer1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	@Override
	public int hashCode() {  //return name.hashCode() + id.hashCode();
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer1 other = (Customer1) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		/*
		if(this == obj){
			return true;
		}else if(obj instanceof Customer1){
			Customer1 cust = (Customer1)obj;
			if(this.name.equals(cust.name) && this.id.equals(cust.id)){
				return true;
			}else{
				return false;
			}
		}else
			return false;*/
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Customer1){
			Customer1 cust = (Customer1)o;
			return this.name.compareTo(cust.name);
			//return this.id.compareTo(cust.id);
		}
		return 0;
	}
	
	
}
