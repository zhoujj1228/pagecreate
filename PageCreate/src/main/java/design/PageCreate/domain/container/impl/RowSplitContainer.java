package design.PageCreate.domain.container.impl;

import design.PageCreate.domain.container.RowContainer;

public class RowSplitContainer extends RowContainer<ColSplitContainer>{
	public RowSplitContainer(double rowSplitNum){
		this.rowSplitNum = rowSplitNum;
	}
	
	private double rowSplitNum;

	public double getRowSplitNum() {
		return rowSplitNum;
	}

	public void setRowSplitNum(double rowSplitNum) {
		this.rowSplitNum = rowSplitNum;
	}

}
