package design.PageCreate.domain.container;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.HtmlTag;
import design.PageCreate.domain.style.CssStyle;

public class Container <T extends Container> extends HtmlTag{
	//include container, row, col
	protected Container supContainer = null;
	protected List<T> subContainerList = new ArrayList<>();
	
	private String value;
	

	public void addSubContainer(T c){
		c.setSupContainer(this);
		subContainerList.add(c);
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


	

	
}
