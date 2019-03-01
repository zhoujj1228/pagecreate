package design.PageCreate.domain.container;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.style.CssStyle;

public class Container <T extends Container>{
	//include container, row, col
	private String type;
	private String idName;
	private List<String> classNameList = new ArrayList<>();
	protected Container supContainer = null;
	protected List<T> subContainerList = new ArrayList<>();
	private List<CssStyle> cssStyleList = new ArrayList<>();
	
	private String value;
	

	public void addSubContainer(T c){
		c.setSupContainer(this);
		subContainerList.add(c);
	}
	
	public void addCssStyle(CssStyle css){
		cssStyleList.add(css);
		classNameList.add(css.getName());
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
	public List<T> getSubContainerList() {
		return subContainerList;
	}
	public void setSubContainerList(List<T> subContainerList) {
		this.subContainerList = subContainerList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<CssStyle> getCssStyleList() {
		return cssStyleList;
	}

	public void setCssStyleList(List<CssStyle> cssStyleList) {
		this.cssStyleList = cssStyleList;
	}
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
