package design.PageCreate.domain.container.impl.col;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.impl.row.RowSplitContainer;

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
		
		this.supContainer = supContainer;
	}

	@Override
	public void beforeAddSubContainer(Container subContainer) {}

	@Override
	public void beforeSetSupContainer(Container supContainer) {
		if(!(supContainer instanceof RowSplitContainer)){
			throw new RuntimeException("supContainer must be RowSplitContainer");
		}
	}
}
