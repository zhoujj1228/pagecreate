package design.PageCreate.domain.container.impl;

import design.PageCreate.domain.container.ColContainer;
import design.PageCreate.domain.container.Container;

public class ColSplitContainer extends ColContainer{
	
	public ColSplitContainer(double holdPart){
		this.holdPart = holdPart;
	}
	
	private double holdPart;

	public double getHoldPart() {
		return holdPart;
	}

	public void setHoldPart(double holdPart) {
		this.holdPart = holdPart;
	}
}
