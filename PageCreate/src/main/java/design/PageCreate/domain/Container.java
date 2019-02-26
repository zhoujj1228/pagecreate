package design.PageCreate.domain;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.style.CssStyle;

public class Container {
	private String idName;
	private List<String> classNameList;
	private Container supContainer = null;
	private List<Container> subContainerList = new ArrayList<>();
	
	public void putSubContainer(Container c){
		c.setSupContainer(this);
		subContainerList.add(c);
	}
	
	public String getIdName() {
		return idName;
	}
	public void setIdName(String idName) {
		this.idName = idName;
	}
	public List<String> getClassNameList() {
		return classNameList;
	}
	public void setClassNameList(List<String> classNameList) {
		this.classNameList = classNameList;
	}
	public Container getSupContainer() {
		return supContainer;
	}
	public void setSupContainer(Container supContainer) {
		this.supContainer = supContainer;
	}
	public List<Container> getSubContainerList() {
		return subContainerList;
	}
	public void setSubContainerList(List<Container> subContainerList) {
		this.subContainerList = subContainerList;
	}
	
	
	
}
