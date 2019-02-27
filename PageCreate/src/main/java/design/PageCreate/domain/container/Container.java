package design.PageCreate.domain.container;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.style.CssStyle;

public class Container {
	//include container, row, col
	private String type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}