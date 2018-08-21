package com.kxw.pojo;

public class Category {
	
  private int id;
  private String name;
  private int parentId;
  private int status;
  private int priority;
  private int depth;
  
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
public int getParentId() {
	return parentId;
}
public void setParentId(int parentId) {
	this.parentId = parentId;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}
public int getDepth() {
	return depth;
}
public void setDepth(int depth) {
	this.depth = depth;
}
  
  

}
