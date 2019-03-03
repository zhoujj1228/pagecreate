package design.PageCreate.domain.container;

import java.util.ArrayList;
import java.util.List;

import design.PageCreate.domain.HtmlTag;
import design.PageCreate.domain.container.interfaces.BeforeOperInterface;
import design.PageCreate.domain.style.CssStyle;

public abstract class Container extends HtmlTag implements BeforeOperInterface{
	//include container, row, col
	protected Container supContainer = null;
	protected List<Container> subContainerList = new ArrayList<>();

	public void addSubContainer(Container c){
		beforeAddSubContainer(c);
		c.setSupContainer(this);
		subContainerList.add(c);
	}

	public Container getSupContainer() {
		return supContainer;
	}
	public void setSupContainer(Container supContainer) {
		beforeSetSupContainer(supContainer);
		this.supContainer = supContainer;
	}
	public List<Container> getSubContainerList() {
		return subContainerList;
	}
	public void setSubContainerList(List<Container> subContainerList) {
		this.subContainerList = subContainerList;
	}


}
