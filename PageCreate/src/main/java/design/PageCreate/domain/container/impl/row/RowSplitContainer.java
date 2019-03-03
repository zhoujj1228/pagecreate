package design.PageCreate.domain.container.impl.row;

import java.util.List;

import design.PageCreate.domain.container.Container;
import design.PageCreate.domain.container.RowContainer;
import design.PageCreate.domain.container.impl.col.ColSplitContainer;
import design.PageCreate.domain.style.CssStyle;
import design.PageCreate.domain.style.impl.ColSplitStyle;
import design.PageCreate.domain.style.impl.FixBoxStyle;

public class RowSplitContainer extends RowContainer{
	private int rowSplitNum = 0;

	public RowSplitContainer(int rowSplitNum){
		super();
		this.rowSplitNum = rowSplitNum;
	}
	
	
	
	public int getRowSplitNum() {
		return rowSplitNum;
	}

	public void setRowSplitNum(int rowSplitNum) {
		this.rowSplitNum = rowSplitNum;
	}

	@Override
	public void beforeAddSubContainer(Container subContainer) {
		ColSplitContainer splitCol = (ColSplitContainer) subContainer;
		double colHoldPercent = (double)splitCol.getColHoldPart() / (double)rowSplitNum * 100;
		ColSplitStyle colSplitStyle = new ColSplitStyle(colHoldPercent, splitCol.getColHoldPart(), rowSplitNum);
		subContainer.addCssStyle(colSplitStyle);
		
	}

	@Override
	public void beforeSetSupContainer(Container supContainer) {}
}
