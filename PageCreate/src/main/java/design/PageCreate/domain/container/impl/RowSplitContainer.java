package design.PageCreate.domain.container.impl;

import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.ColSplitStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;

public class RowSplitContainer<T extends ColSplitContainer> extends RowContainer<T>{
	private int rowSplitNum = 0;

	public RowSplitContainer(int rowSplitNum){
		super();
		this.rowSplitNum = rowSplitNum;
	}
	
	public void addSubContainer(T c){
		double colHoldPercent = (double)c.getColHoldPart() / (double)rowSplitNum * 100;
		ColSplitStyle colSplitStyle = new ColSplitStyle(colHoldPercent, c.getColHoldPart(), rowSplitNum);
		c.addCssStyle(colSplitStyle);
		
		c.setSupContainer(this);
		subContainerList.add(c);
	}
	
	
	public int getRowSplitNum() {
		return rowSplitNum;
	}

	public void setRowSplitNum(int rowSplitNum) {
		this.rowSplitNum = rowSplitNum;
	}
}
