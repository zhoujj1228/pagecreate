package design.PageCreate.domain;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.style.CssStyle;

public class HtmlTag {

	private List<String> classNameList = new ArrayList<>();
	private List<CssStyle> cssStyleList = new ArrayList<>();
	private String idName;
	
	
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

	public List<CssStyle> getCssStyleList() {
		return cssStyleList;
	}

	public void setCssStyleList(List<CssStyle> cssStyleList) {
		this.cssStyleList = cssStyleList;
	}
}
