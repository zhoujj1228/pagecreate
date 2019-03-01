package design.PageCreate.domain.container.impl;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;

public class ColSplitContainer extends ColContainer{
	
	public ColSplitContainer(int colHoldPart){
		this.colHoldPart = colHoldPart;
	}
	
	private int colHoldPart;
	
	public int getColHoldPart() {
		return colHoldPart;
	}

	public void setColHoldPart(int colHoldPart) {
		this.colHoldPart = colHoldPart;
	}

	@Override
	public RowSplitContainer getSupContainer() {
		return (RowSplitContainer) supContainer;
	}
	
	@Override
	public void setSupContainer(Container supContainer) {
		if(!(supContainer instanceof RowSplitContainer)){
			throw new RuntimeException("supContainer must be RowSplitContainer");
		}
		this.supContainer = supContainer;
	}
}
