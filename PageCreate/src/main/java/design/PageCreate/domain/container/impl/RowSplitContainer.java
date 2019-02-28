package design.PageCreate.domain.container.impl;

import design.PageCreate.domain.container.RowContainer;

public class RowSplitContainer extends RowContainer<ColSplitContainer>{
	private int rowSplitNum = 0;

	public int getRowSplitNum() {
		return rowSplitNum;
	}

	public void setRowSplitNum(int rowSplitNum) {
		this.rowSplitNum = rowSplitNum;
	}
}
